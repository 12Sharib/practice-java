package Streams.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class June20Classes {

  static class Movie {

    String title;
    int year;
    double rating;

    Movie(String title, int year, double rating) {
      this.title = title;
      this.year = year;
      this.rating = rating;
    }

    public String getTitle() {
      return title;
    }

    public int getYear() {
      return year;
    }

    public double getRating() {
      return rating;
    }

    @Override
    public String toString() {
      return title + " (" + year + ") - " + rating;
    }
  }

  static class Employee {

    String name;
    String department;
    int salary;

    Employee(String name, String department, int salary) {
      this.name = name;
      this.department = department;
      this.salary = salary;
    }

    public String getName() {
      return name;
    }

    public String getDepartment() {
      return department;
    }

    public int getSalary() {
      return salary;
    }

    @Override
    public String toString() {
      return name + " - " + salary;
    }
  }

  static class Student {

    String name;
    String grade;   // "A", "B", "C"
    String section; // "Red", "Blue"

    Student(String name, String grade, String section) {
      this.name = name;
      this.grade = grade;
      this.section = section;
    }

    public String getName() {
      return name;
    }

    public String getGrade() {
      return grade;
    }

    public String getSection() {
      return section;
    }

    @Override
    public String toString() {
      return name + " (" + grade + " - " + section + ")";
    }
  }

  static class Product {

    String name;
    String category;
    int price;

    Product(String name, String category, int price) {
      this.name = name;
      this.category = category;
      this.price = price;
    }

    public String getName() {
      return name;
    }

    public String getCategory() {
      return category;
    }

    public int getPrice() {
      return price;
    }

    @Override
    public String toString() {
      return name + " - " + price;
    }
  }


  private static void question1() {
//    Group movies by year
//    For each year, find the movie with the highest rating
    List<Movie> movies = Arrays.asList(
        new Movie("Inception", 2010, 8.8),
        new Movie("The Dark Knight", 2008, 9.0),
        new Movie("Interstellar", 2014, 8.6),
        new Movie("Tenet", 2020, 7.5),
        new Movie("Dunkirk", 2017, 7.9),
        new Movie("The Prestige", 2006, 8.5),
        new Movie("Batman Begins", 2005, 8.2)
    );

    System.out.println(
        movies
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Movie::getYear,
                        Collectors.collectingAndThen(
                            Collectors.maxBy(Comparator.comparing(Movie::getRating)),
                            Optional::get
                        )

                    )
            )
    );


  }

  private static void question2() {
    List<Employee> employees = Arrays.asList(
        new Employee("Alice", "HR", 40000),
        new Employee("Bob", "IT", 55000),
        new Employee("Charlie", "HR", 42000),
        new Employee("David", "IT", 60000),
        new Employee("Eve", "Finance", 48000),
        new Employee("Frank", "Finance", 52000),
        new Employee("Grace", "HR", 39000)
    );

// Group employees by department
// For each department, find the employee with the highest salary

    System.out.println(
        employees
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                            Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                            Optional::get
                        )
                    )
            )
    );

  }

  private static void question3() {
    List<Student> students = Arrays.asList(
        new Student("Alice", "A", "Red"),
        new Student("Bob", "B", "Blue"),
        new Student("Charlie", "A", "Blue"),
        new Student("David", "A", "Red"),
        new Student("Eve", "B", "Red"),
        new Student("Frank", "C", "Blue"),
        new Student("Grace", "C", "Red")
    );

//    Group students first by grade, then by section

    System.out.println(
        students
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Student::getGrade,
                        Collectors.groupingBy(
                            Student::getSection
                        )
                    )
            )
    );

  }

  private static void question4() {
//    Group products by category
//    For each category, collect a list of product names (only names, not objects)
    List<Product> products = Arrays.asList(
        new Product("iPhone", "Electronics", 900),
        new Product("Laptop", "Electronics", 1200),
        new Product("Shirt", "Clothing", 60),
        new Product("Pants", "Clothing", 80),
        new Product("TV", "Electronics", 700)
    );

    System.out.println(
        products
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Product::getCategory,
                        Collectors.mapping(
                            Product::getName, Collectors.toList()
                        )
                    )
            )
    );

  }

  public static void main(String[] args) {
//    question1();
//    question2();
//    question3();
    question4();

  }

}
