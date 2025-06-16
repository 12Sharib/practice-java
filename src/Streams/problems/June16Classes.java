package Streams.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class June16Classes {

  static class Student {

    String name;
    int marks;
    String grade;

    Student(String name, int marks, String grade) {
      this.name = name;
      this.marks = marks;
      this.grade = grade;
    }

    public String getName() {
      return name;
    }

    public int getMarks() {
      return marks;
    }

    public String getGrade() {
      return grade;
    }

    @Override
    public String toString() {
      return name + " - " + marks + " (" + grade + ")";
    }
  }

  static class Order {

    String customer;
    int amount;

    Order(String customer, int amount) {
      this.customer = customer;
      this.amount = amount;
    }

    public String getCustomer() {
      return customer;
    }

    public int getAmount() {
      return amount;
    }

    @Override
    public String toString() {
      return customer + " - " + amount;
    }
  }

  static class Employee {
    String name;
    String city;

    Employee(String name, String city) {
      this.name = name;
      this.city = city;
    }

    public String getName() { return name; }
    public String getCity() { return city; }

    @Override
    public String toString() {
      return name + " from " + city;
    }
  }



  private static void question1() {
    List<Student> students = Arrays.asList(
        new Student("Alice", 85, "A"),
        new Student("Bob", 92, "A"),
        new Student("Charlie", 78, "B"),
        new Student("David", 65, "C"),
        new Student("Eve", 80, "B"),
        new Student("Frank", 55, "C")
    );

//    Using Stream API:
//    Group students by their grade
//    For each grade, find the student with the highest marks
//    Your result should be a Map<String, Student>
//    where key = grade, value = top-scoring student in that grade.

    System.out.println(students
        .stream()
        .collect(
            Collectors
                .groupingBy(
                    Student::getGrade,
                    Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(Student::getMarks)),
                        Optional::get)
                )
        ));

  }

  private static void question2() {
//    Find the total amount spent per customer
//  Return a Map<String, Integer>
    List<Order> orders = Arrays.asList(
        new Order("Alice", 250),
        new Order("Bob", 400),
        new Order("Alice", 150),
        new Order("Bob", 300),
        new Order("Charlie", 500)
    );

      System.out.println(
          orders
              .stream()
              .collect(
                  Collectors
                      .groupingBy(
                          Order::getCustomer,
                          Collectors.summingInt(Order::getAmount)
                      )
              )
      );

  }

  private static void question3(){
//    group employees by their city
//    Return a Map<String, List<String>> where:
//    Key = city
//    Value = list of employee names in that city

    List<Employee> employees = Arrays.asList(
        new Employee("Alice", "Delhi"),
        new Employee("Bob", "Mumbai"),
        new Employee("Charlie", "Delhi"),
        new Employee("David", "Bangalore"),
        new Employee("Eve", "Mumbai")
    );

    System.out.println(
        employees
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Employee::getCity,
                        Collectors.mapping(Employee::getName, Collectors.toList())
                    )
            )
    );



  }

  public static void main(String[] args) {
//    question1();
//    question2();
    question3();

  }

}
