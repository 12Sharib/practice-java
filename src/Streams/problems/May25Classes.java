package Streams.problems;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class May25Classes {
  static class Employee {
    String name;
    int salary;
    String department;

    public String getDepartment() {
      return department;
    }

    public int getSalary() {
      return salary;
    }


    @Override
    public String toString() {
      return "Employee{" +
          "name='" + name + '\'' +
          ", salary=" + salary +
          ", department='" + department + '\'' +
          '}';
    }

    public Employee(String name, int salary, String department) {
      this.name = name;
      this.salary = salary;
      this.department = department;
    }

  }
  private static void question1(){
//  You have a list of Employee objects with fields: name, salary, and department.
//  Return a Map<String, Optional<Employee>> where the key is the department name,
//  and the value is the employee with the highest salary in that department.

    List<Employee> employees = List.of(
        new Employee("Alice", 50000, "HR"),
        new Employee("Bob", 60000, "HR"),
        new Employee("Charlie", 70000, "Engineering"),
        new Employee("David", 80000, "Engineering"),
        new Employee("Eve", 45000, "Sales")
    );

    System.out.println(employees.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy((a, b) -> a.salary - b.salary))));


    System.out.println(employees.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(e -> e.salary)))));

  }


  public static void main(String[] args) {
    question1();

  }

}
