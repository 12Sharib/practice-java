package Streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class June5Classes {

  static class Employee {
    private String name;
    private int salary;
    private String department;

    // constructor
    public Employee(String name, int salary, String department) {
      this.name = name;
      this.salary = salary;
      this.department = department;
    }

    // getters
    public String getName() { return name; }
    public int getSalary() { return salary; }
    public String getDepartment() { return department; }
  }



  private static void question2(){
    List<Employee> employees = Arrays.asList(
        new Employee("Alice", 95000, "Engineering"),
        new Employee("Bob", 87000, "Sales"),
        new Employee("Charlie", 99000, "Engineering"),
        new Employee("David", 103000, "Engineering"),
        new Employee("Eve", 78000, "Engineering"),
        new Employee("Frank", 87000, "HR")
    );

    System.out.println(employees
        .stream()
            .filter(employee -> employee.getDepartment().equals("Engineering"))
        .sorted((x,y) -> y.getSalary() - x.getSalary())
            .map(Employee::getName).limit(3)
        .collect(Collectors.toList()));

  }

  public static void main(String[] args) {

question2();



  }

}
