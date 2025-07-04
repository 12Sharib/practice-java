package Streams.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class July3Classes {

  static class Student {

    private String name;
    private String subject;
    private int marks;

    // constructor, getters
    public Student(String name, String subject, int marks) {
      this.name = name;
      this.subject = subject;
      this.marks = marks;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getSubject() {
      return subject;
    }

    public void setSubject(String subject) {
      this.subject = subject;
    }

    public int getMarks() {
      return marks;
    }

    public void setMarks(int marks) {
      this.marks = marks;
    }

    @Override
    public String toString() {
      return "Student{" +
          "name='" + name + '\'' +
          ", subject='" + subject + '\'' +
          ", marks=" + marks +
          '}';
    }
  }

  static class Employee {

    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
      this.name = name;
      this.department = department;
      this.salary = salary;
    }

    public String getName() {
      return name;
    }

    public String getDepartment() {
      return department;
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
//  Group students by subject
//  For each subject, find the student with highest marks
//  Return a Map<String, Student> → subject → top scorer
    List<Student> students = List.of(
        new Student("Alice", "Math", 88),
        new Student("Bob", "Math", 91),
        new Student("Charlie", "Science", 85),
        new Student("David", "Science", 92),
        new Student("Eve", "Math", 95)
    );

    System.out.println(
        students
            .stream()
            .collect(
                Collectors.groupingBy(
                    Student::getSubject,
                    Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(Student::getMarks))
                        ,
                        opt -> opt.get().name
                    )

                )
            )
    );

  }

  private static void question2() {
//     average salary by department
    List<Employee> employees = List.of(
        new Employee("Alice", "HR", 50000),
        new Employee("Bob", "HR", 55000),
        new Employee("Charlie", "IT", 70000),
        new Employee("David", "IT", 80000),
        new Employee("Eve", "Finance", 60000),
        new Employee("Frank", "Finance", 65000)
    );

    System.out.println(
        employees
            .stream()
            .collect(
                Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.averagingInt(Employee::getSalary)
                )
            )
    );

//    Find max salary employee

    System.out.println(
        employees
            .stream()
            .collect(
                Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                        Optional::get
                    )
                )
            )
    );

//    List of employee in each department
    System.out.println(
        employees
            .stream()
            .collect(
                Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.mapping(
                        Employee::getName, Collectors.toList()
                    )

//                    Collectors.collectingAndThen(
//                        Collectors.toList(),
//                        employee -> employee.stream().map(e -> e.getName()).toList()
//                    )
                )
            )
    );

  }


  public static void main(String[] args) {
//    question1();
    question2();

  }

}
