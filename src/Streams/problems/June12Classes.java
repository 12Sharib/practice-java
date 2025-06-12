package Streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class June12Classes {

  static class Employee {

    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
      this.name = name;
      this.department = department;
      this.salary = salary;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getDepartment() {
      return department;
    }

    public void setDepartment(String department) {
      this.department = department;
    }

    public int getSalary() {
      return salary;
    }

    public void setSalary(int salary) {
      this.salary = salary;
    }
    // constructor, getters
  }


  static class Book {

    private String title;
    private String author;
    private int pages;

    // constructor, getters
    public Book(String title, String author, int pages) {
      this.title = title;
      this.author = author;
      this.pages = pages;
    }

    public String getTitle() {
      return title;
    }

    public String getAuthor() {
      return author;
    }

    public int getPages() {
      return pages;
    }
  }


  private static void question1() {
//    Group employees by department and get the total salary per department using Stream API.
    List<Employee> employees = Arrays.asList(
        new Employee("Alice", "HR", 50000),
        new Employee("Bob", "Engineering", 75000),
        new Employee("Charlie", "HR", 60000),
        new Employee("David", "Engineering", 80000),
        new Employee("Eva", "Marketing", 65000)
    );

    System.out.println(
        employees
            .stream()
            .collect(
                Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.summingInt(Employee::getSalary)
                )
            )
    );

  }

  private static void question2() {
//    Use Stream API to group books by author and calculate total pages written by each author.
    List<Book> books = Arrays.asList(
        new Book("Java Basics", "Alice", 200),
        new Book("Spring Boot", "Bob", 350),
        new Book("Advanced Java", "Alice", 450),
        new Book("Hibernate", "Charlie", 300)
    );

    System.out.println(
        books
            .stream()
            .collect(
                Collectors.groupingBy(
                    Book::getAuthor, Collectors.summingInt(Book::getPages)
                )
            )
    );


  }


  public static void main(String[] args) {
//    question1();
    question2();

  }

}
