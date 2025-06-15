package Streams.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class June15Classes {

  static class Employee {

    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
      this.name = name;
      this.department = department;
      this.salary = salary;
    }

    // Getters
    public String getName() {
      return name;
    }

    public String getDepartment() {
      return department;
    }

    public int getSalary() {
      return salary;
    }
  }

  static class Product {

    String name;
    String category;
    double price;

    Product(String name, String category, double price) {
      this.name = name;
      this.category = category;
      this.price = price;
    }

    // Getters
    public String getName() {
      return name;
    }

    public String getCategory() {
      return category;
    }

    public double getPrice() {
      return price;
    }

    @Override
    public String toString() {
      return name + " - " + price;
    }
  }

  private static void question1() {
//    Using Stream API, group the employees by department and find the average salary per department.
    List<Employee> employees = Arrays.asList(
        new Employee("Alice", "IT", 70000),
        new Employee("Bob", "HR", 55000),
        new Employee("Charlie", "IT", 80000),
        new Employee("David", "HR", 50000),
        new Employee("Eve", "Finance", 60000)
    );

    System.out.println(employees
        .stream()
        .collect(
            Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingInt(Employee::getSalary)
            )
        ));

  }

  private static void question2() {
//    Task:
//    Using the Stream API:
//    Group the products by category,
//    Then find the most expensive product in each category.

    List<Product> products = Arrays.asList(
        new Product("Laptop", "Electronics", 90000),
        new Product("TV", "Electronics", 55000),
        new Product("Chair", "Furniture", 7000),
        new Product("Table", "Furniture", 15000),
        new Product("Pen", "Stationery", 50)
    );

    Map<String, Product> mostExpensiveByCategory = products
        .stream()
        .collect(
            Collectors.groupingBy(
                Product::getCategory,
                Collectors.collectingAndThen(
                    Collectors.maxBy(Comparator.comparing(Product::getPrice)),
                    Optional::get
                )
            )
        );

    System.out.println(mostExpensiveByCategory);


  }


  public static void main(String[] args) {
//    question1();
    question2();
  }

}
