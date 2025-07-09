package Streams.problems;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class July9 {

  static class Employee {

    private String name;
    private String department;
    private String city;
    private int salary;

    public Employee(String name, String department, String city, int salary) {
      this.name = name;
      this.department = department;
      this.city = city;
      this.salary = salary;
    }

    public String getName() {
      return name;
    }

    public String getDepartment() {
      return department;
    }

    public String getCity() {
      return city;
    }

    public int getSalary() {
      return salary;
    }

    @Override
    public String toString() {
      return name + " (" + salary + ")";
    }
  }

  private static void question1() {
    List<Employee> employees = List.of(
        new Employee("Alice", "HR", "Delhi", 50000),
        new Employee("Bob", "HR", "Delhi", 55000),
        new Employee("Charlie", "HR", "Mumbai", 52000),
        new Employee("David", "IT", "Delhi", 70000),
        new Employee("Eve", "IT", "Delhi", 75000),
        new Employee("Frank", "IT", "Mumbai", 72000),
        new Employee("Grace", "Finance", "Delhi", 60000),
        new Employee("Hank", "Finance", "Mumbai", 63000)
    );

    Map<String, Map<String, Employee>> result = employees
        .stream()
        .collect(
            Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.groupingBy(
                    Employee::getCity,
                    Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                        Optional::get
                    )
                )
            )
        );

    System.out.println(result);


  }


  public static void main(String[] args) {
    question1();

  }

}
