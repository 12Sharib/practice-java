package Streams.problems;

import java.util.List;
import java.util.stream.Collectors;

public class July6 {
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


  private static void question1(){
//    Department
//Then by City
    List<Employee> employees = List.of(
        new Employee("Alice", "HR", "Delhi", 50000),
        new Employee("Bob", "HR", "Mumbai", 55000),
        new Employee("Charlie", "IT", "Delhi", 70000),
        new Employee("David", "IT", "Mumbai", 80000),
        new Employee("Eve", "Finance", "Delhi", 60000),
        new Employee("Frank", "Finance", "Mumbai", 65000),
        new Employee("Grace", "HR", "Delhi", 52000)
    );

    System.out.println(
        employees
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Employee::getDepartment,
                        Collectors.groupingBy(
                            Employee::getCity,
                            Collectors.averagingInt(Employee::getSalary)
                        )
                    )
            )
    );

  }

  public static void main(String[] args) {
    question1();

  }

}
