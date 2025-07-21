package Streams.problems;

import java.util.List;
import java.util.stream.Collectors;

public class July21Classes {

  static class Product {

    private String name;
    private String category;
    private double price;

    // constructor, getters
    public Product(String name, String category, double price) {
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

    public double getPrice() {
      return price;
    }
  }

  static class Employee {

    String department;
    double salary;

    // constructor, getters
    public Employee(String department, double salary) {
      this.department = department;
      this.salary = salary;
    }

    public String getDepartment() {
      return department;
    }

    public double getSalary() {
      return salary;
    }
  }


  private static void question1() {
//    Using Stream API, group the products by category and find the total price per category. Output should be a Map<String, Double>.
    List<Product> products = List.of(
        new Product("Pen", "Stationery", 10.0),
        new Product("Notebook", "Stationery", 25.0),
        new Product("Shampoo", "Personal Care", 55.0),
        new Product("Soap", "Personal Care", 30.0),
        new Product("Chair", "Furniture", 250.0)
    );

    System.out.println(
        products
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Product::getCategory,
                        Collectors.summingDouble(Product::getPrice)
                    )
            )
    );

  }

  private static void question2() {
//    Using Stream API, group employees by department and calculate the average salary per department.
//Return a Map<String, Double>.
    List<Employee> employees = List.of(
        new Employee("HR", 50000),
        new Employee("IT", 75000),
        new Employee("HR", 60000),
        new Employee("IT", 90000),
        new Employee("Finance", 70000)
    );

    System.out.println(
        employees
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Employee::getDepartment,
                        Collectors
                            .averagingDouble(Employee::getSalary)
                    )
            )
    );


  }


  public static void main(String[] args) {
    question1();
    question2();

  }

}
