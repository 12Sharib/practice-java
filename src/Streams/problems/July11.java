package Streams.problems;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class July11 {

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

  static class Student {
    private String name;
    private String subject;
    private int marks;

    public Student(String name, String subject, int marks) {
      this.name = name;
      this.subject = subject;
      this.marks = marks;
    }

    public String getName() { return name; }
    public String getSubject() { return subject; }
    public int getMarks() { return marks; }
  }


  private static void question1() {
//    Return a List<Integer> containing the top 3 largest even numbers, sorted in descending order.
    List<Integer> numbers = List.of(4, 7, 2, 9, 12, 6, 1, 15);

    System.out.println(
        numbers
            .stream()
            .filter(value -> value % 2 == 0)
            .sorted(Comparator.reverseOrder())
            .limit(3)
            .toList()

    );
  }

  private static void question2() {
//    Return a Map<String, Integer> — category → total duration of all courses in that category.
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

  private static void question3() {
    // Using Stream API, return a Map<String, Long> that shows the frequency of each word in the list.
    List<String> words = List.of("apple", "banana", "cherry", "date", "apple", "banana", "apple");

    System.out.println(
        words
            .stream()
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
//    Return a Map<String, String> → subject → student name
//    of the student with the highest marks in each subject.
    List<Student> students = List.of(
        new Student("Alice", "Math", 88),
        new Student("Bob", "Math", 92),
        new Student("Charlie", "Physics", 79),
        new Student("David", "Physics", 85),
        new Student("Eve", "Chemistry", 91)
    );

    System.out.println(
        students
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Student::getSubject,
                        Collectors
                            .collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Student::getMarks)),
                                optStu -> optStu.get().name
                            )
                    )
            )
    );

  }

  public static void main(String[] args) {
//    question1();
//    question2();
//    question3();
    question4();

  }

}
