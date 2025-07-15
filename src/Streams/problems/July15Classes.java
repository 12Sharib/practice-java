package Streams.problems;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class July15Classes {

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
  }

  static class Course {

    private String name;
    private String category;
    private int duration;

    public Course(String name, String category, int duration) {
      this.name = name;
      this.category = category;
      this.duration = duration;
    }

    public String getName() {
      return name;
    }

    public String getCategory() {
      return category;
    }

    public int getDuration() {
      return duration;
    }
  }


  private static void question1() {
//   Return a Map<String, String> → department → employee name
//  of the employee with the highest salary in each department.

    List<Employee> employees = List.of(
        new Employee("Alice", "HR", 50000),
        new Employee("Bob", "HR", 60000),
        new Employee("Charlie", "IT", 70000),
        new Employee("David", "IT", 55000),
        new Employee("Eve", "Finance", 65000)
    );

    System.out.println(
        employees
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Employee::getDepartment,
                        Collectors
                            .collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                                optEmp -> optEmp.get().getName()
                            )
                    )
            )
    );

  }

  private static void question2() {
//   Return a Map<String, Integer> — category → total duration
//  of all courses in that category.
    List<Course> courses = List.of(
        new Course("Java", "Programming", 30),
        new Course("Spring Boot", "Programming", 25),
        new Course("Photoshop", "Design", 20),
        new Course("Figma", "Design", 15),
        new Course("AI Basics", "AI", 10)
    );

    System.out.println(
        courses
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Course::getCategory,
                        Collectors.summingInt(Course::getDuration)
                    )
            )
    );

  }

  public static void main(String[] args) {
//    question1();
    question2();

  }

}
