package Streams.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class June9Classes {

  static class Order {

    String orderId;
    String status;
    int amount;

    public Order(String orderId, String status, int amount) {
      this.orderId = orderId;
      this.status = status;
      this.amount = amount;
    }

    @Override
    public String toString() {
      return "Order{" +
          "orderId='" + orderId + '\'' +
          ", status='" + status + '\'' +
          ", amount=" + amount +
          '}';
    }

    public String getOrderId() {
      return orderId;
    }

    public void setOrderId(String orderId) {
      this.orderId = orderId;
    }

    public String getStatus() {
      return status;
    }

    public void setStatus(String status) {
      this.status = status;
    }

    public int getAmount() {
      return amount;
    }

    public void setAmount(int amount) {
      this.amount = amount;
    }
    // constructor, getters
  }

  static class Employee {

    String name;
    String city;
    int age;

    @Override
    public String toString() {
      return "Employee{" +
          "name='" + name + '\'' +
          ", city='" + city + '\'' +
          ", age=" + age +
          '}';
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getCity() {
      return city;
    }

    public void setCity(String city) {
      this.city = city;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public Employee(String name, String city, int age) {
      this.name = name;
      this.city = city;
      this.age = age;
    }
// constructor, getters
  }

  static class Student {

    String name;
    int marks;
    String subject;

    // constructor, getters
    public Student(String name, int marks, String subject) {
      this.name = name;
      this.marks = marks;
      this.subject = subject;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getMarks() {
      return marks;
    }

    public void setMarks(int marks) {
      this.marks = marks;
    }

    public String getSubject() {
      return subject;
    }

    public void setSubject(String subject) {
      this.subject = subject;
    }
  }


  private static void question1() {
//     Use Stream API to get the total amount of all DELIVERED orders.
    List<Order> orders = Arrays.asList(
        new Order("O1", "DELIVERED", 250),
        new Order("O2", "PENDING", 100),
        new Order("O3", "DELIVERED", 400),
        new Order("O4", "CANCELLED", 150)
    );

    System.out.println(
        orders
            .stream()
            .filter(order -> order.getStatus().equals("DELIVERED"))
            .collect(
                Collectors.groupingBy(Order::getStatus, Collectors.summarizingInt(Order::getAmount))
            )
    );
  }

  private static void question2() {
//    Write a Stream operation to group employees by city, and within each city, get a list of names sorted by age.

    List<Employee> employees = Arrays.asList(
        new Employee("Alice", "Delhi", 30),
        new Employee("Bob", "Mumbai", 28),
        new Employee("Charlie", "Delhi", 33),
        new Employee("David", "Bangalore", 28),
        new Employee("Eve", "Mumbai", 35)
    );

    System.out.println(
        employees
            .stream()
            .collect(
                Collectors.groupingBy(
                    Employee::getCity,
                    Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list
                            .stream()
                            .sorted(Comparator.comparing(Employee::getAge))
                            .map(Employee::getName)
                            .toList()
                    )
                )
            )
    );

  }

  private static void question3() {
//  Task:
//  Group students by subject
//  For each subject, get the average marks

    List<Student> students = Arrays.asList(
        new Student("Alice", 88, "Math"),
        new Student("Bob", 92, "Science"),
        new Student("Charlie", 70, "Math"),
        new Student("David", 95, "Science"),
        new Student("Eva", 60, "Math")
    );

    System.out.println(
        students
            .stream()
            .collect(
                Collectors.groupingBy(
                    Student::getSubject,
                    Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream().mapToInt(Student::getMarks).average()
                    )
                )
            )
    );

    System.out.println(
        students
            .stream()
            .collect(
                Collectors.groupingBy(
                    Student::getSubject,
                    Collectors.averagingInt(Student::getMarks)
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
