package Streams.problems;

import java.util.List;
import java.util.stream.Collectors;

public class May24Classes {
  static class Employee {
    String name;
    String department;

    Employee(String name, String department){
      this.name = name;
      this.department = department;
    }

    private String getDepartment(){
      return department;
    }

    // constructor, getters
  }

  private static void question1(){

//    You’re given a list of Employee objects. Return a Map<String, Long> where:
//    The key is the department name
//    The value is the count of employees in that department

    List<Employee> employees = List.of(
        new Employee("Alice", "HR"),
        new Employee("Bob", "Engineering"),
        new Employee("Charlie", "HR"),
        new Employee("David", "Engineering"),
        new Employee("Eva", "Sales")
    );

    System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));


  }


  public static void main(String[] args) {
    question1();

  }

}
