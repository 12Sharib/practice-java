package Streams.problems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class July10 {

  static class Employee {

    private String name;
    private String department;
    private String city;

    public Employee(String name, String department, String city) {
      this.name = name;
      this.department = department;
      this.city = city;
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
  }

  static class Student {
    private String name;
    private String grade;
    private int marks;

    public Student(String name, String grade, int marks) {
      this.name = name;
      this.grade = grade;
      this.marks = marks;
    }

    public String getName() { return name; }
    public String getGrade() { return grade; }
    public int getMarks() { return marks; }
  }


  private static void question1() {
//    Return a List<String> of words that start with "a", converted to uppercase, and sorted in reverse order.
    List<String> words = List.of("apple", "banana", "apricot", "cherry", "avocado", "blueberry");

    System.out.println(
        words
            .stream()
            .filter(x -> x.startsWith("a"))
            .map(String::toUpperCase)
            .sorted(Comparator.reverseOrder())
            .toList()
    );


  }

  private static void question2() {
//    Return a Map<String, Set<String>> — department → set of cities where its employees are located.
    List<Employee> employees = List.of(
        new Employee("Alice", "HR", "Delhi"),
        new Employee("Bob", "HR", "Mumbai"),
        new Employee("Charlie", "IT", "Delhi"),
        new Employee("David", "Finance", "Mumbai"),
        new Employee("Eve", "Finance", "Delhi"),
        new Employee("Frank", "IT", "Mumbai")
    );

    System.out.println(
        employees
            .stream()
            .collect(
                Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.mapping(Employee::getCity, Collectors.toList())
                )
            )
    );

  }

  private static void question3() {
// Using Stream API, return a Map<String, Long>
// where the key is each word and value is how many times it appears.
    List<String> lines = List.of(
        "apple banana",
        "banana cherry apple",
        "avocado banana"
    );

    System.out.println(
        lines
            .stream()
            .flatMap(line -> Arrays.stream(line.split(" ")))
            .collect(
                Collectors
                    .groupingBy(
                        Function.identity(),
                        Collectors.counting()
                    )
            )
    );

  }


  private static void question4(){
//    Return a Map<String, String>
//where the key is grade, and the value is the name of the student with the highest marks in that grade.
    List<Student> students = List.of(
        new Student("Alice", "A", 85),
        new Student("Bob", "A", 90),
        new Student("Charlie", "B", 70),
        new Student("David", "B", 75),
        new Student("Eve", "A", 95),
        new Student("Frank", "C", 65)
    );

    System.out.println(
        students
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Student::getGrade,
                        Collectors.maxBy(Comparator.comparing(Student::getMarks))
                    )
            )
    );

  }

  public static void main(String[] args) {
//    question1();
    question2();
  }

}
