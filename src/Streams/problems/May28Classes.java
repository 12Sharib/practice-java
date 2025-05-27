package Streams.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class May28Classes {

  static class Employee {

    String name;
    String department;
    int salary;

    public String getName() {
      return name;
    }

    public String getDepartment() {
      return department;
    }

    public int getSalary() {
      return salary;
    }

    public Employee(String name, String department, int salary) {
      this.name = name;
      this.department = department;
      this.salary = salary;
    }

    @Override
    public String toString() {
      return "Employee{" +
          "name='" + name + '\'' +
          ", department='" + department + '\'' +
          ", salary=" + salary +
          '}';
    }
  }

  private static void question1() {
    List<Employee> employees = Arrays.asList(
        new Employee("Alice", "HR", 5000),
        new Employee("Bob", "IT", 7000),
        new Employee("Charlie", "IT", 8000),
        new Employee("David", "HR", 5500),
        new Employee("Eve", "Sales", 4000)
    );

//  You have a list of Employee objects. Each employee has a name, department, and salary.
//  Group employees by department and find the average salary in each department.

    System.out.println(
        employees
            .stream()
            .collect(
                Collectors.groupingBy(Employee::getDepartment,
                    Collectors.averagingInt(Employee::getSalary))
            )
    );

  }


  public static void main(String[] args) {
    question1();

  }

}
