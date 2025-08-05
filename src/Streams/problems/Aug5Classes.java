package Streams.problems;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Aug5Classes {

  static class Employee {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
      this.name = name;
      this.salary = salary;
    }

    public String getName() {
      return name;
    }

    public int getSalary() {
      return salary;
    }


  }

  static class Product {

    String name;
    String category;
    double price;

    // Constructor, getters
    public Product(String name, String category, double price) {
      this.name = name;
      this.category = category;
      this.price = price;
    }

    public String getCategory() {
      return category;
    }

    public double getPrice() {
      return price;
    }

    public String getName() {
      return name;
    }
  }

  private static void question1() {
    List<Employee> list = List.of(new Employee("Sharib", 200), new Employee("Saifi", 400),
        new Employee("bhar", 600));

    System.out.println(
        list
            .stream()
            .sorted(Comparator.comparing(Employee::getSalary).reversed())
            .skip(1)
            .map(Employee::getName)
            .findFirst()
            .orElse("Invalid")
    );
  }

  private static void question2() {
//     Group the products by category and calculate the average price for each category.
    List<Product> products = List.of(
        new Product("Laptop", "Electronics", 1200),
        new Product("Smartphone", "Electronics", 800),
        new Product("Shampoo", "Personal Care", 300),
        new Product("Toothpaste", "Personal Care", 100),
        new Product("Television", "Electronics", 1500)
    );

    System.out.println(
        products
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)
                    )
            )
    );


  }

  private static void question3() {
//     Group the employees by department and find the maximum salary in each department.
    List<Employee> employees = List.of(
        new Employee("HR", 30000),
        new Employee("IT", 50000),
        new Employee("HR", 35000),
        new Employee("Sales", 40000),
        new Employee("IT", 60000)
    );
    System.out.println(
        employees
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Employee::getName,
                        Collectors
                            .collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                                Optional::get
                            )
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
