package Streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class June27Classes {

  static class Department {

    String name;
    List<Employee> employees;

    Department(String name, List<Employee> employees) {
      this.name = name;
      this.employees = employees;
    }

    public String getName() {
      return name;
    }

    public List<Employee> getEmployees() {
      return employees;
    }
  }

  static class Employee {

    String name;
    int salary;

    Employee(String name, int salary) {
      this.name = name;
      this.salary = salary;
    }

    public String getName() {
      return name;
    }

    public int getSalary() {
      return salary;
    }

    @Override
    public String toString() {
      return name + " - " + salary;
    }
  }

  static class Order {

    String city;
    String item;

    Order(String city, String item) {
      this.city = city;
      this.item = item;
    }

    public String getCity() {
      return city;
    }

    public String getItem() {
      return item;
    }
  }

  private static void question1() {
//    Flatten all employees across departments
//    Find the total salary of all employees

    List<Department> departments = Arrays.asList(
        new Department("HR", Arrays.asList(
            new Employee("Alice", 40000),
            new Employee("Bob", 50000)
        )),
        new Department("IT", Arrays.asList(
            new Employee("Charlie", 70000),
            new Employee("David", 80000)
        )),
        new Department("Finance", Arrays.asList(
            new Employee("Eve", 60000)
        ))
    );

    System.out.println(
        departments
            .stream()
            .flatMap(dept -> dept.employees.stream())
            .map(Employee::getSalary)
            .reduce(Integer::sum)

    );

  }

  private static void question2() {
//    Group orders by city
//    For each city, count how many times each item was ordered
    List<Order> orders = Arrays.asList(
        new Order("Delhi", "Laptop"),
        new Order("Delhi", "Phone"),
        new Order("Mumbai", "Laptop"),
        new Order("Delhi", "Laptop"),
        new Order("Mumbai", "Tablet"),
        new Order("Chennai", "Phone")
    );

    System.out.println(
        orders
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Order::getCity,
                        Collectors.groupingBy(
                            Order::getItem,
                            Collectors.counting()
                        )
                    )
            )
    );

  }


  public static void main(String[] args) {
//    question1();
    question2();

  }

}
