package Streams.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class June24Classes {

  static class Course {

    String name;
    String category;
    int duration; // in hours

    Course(String name, String category, int duration) {
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

    @Override
    public String toString() {
      return name + " (" + duration + " hrs)";
    }
  }

  static class Author {

    String name;
    List<String> books;

    Author(String name, List<String> books) {
      this.name = name;
      this.books = books;
    }

    public String getName() {
      return name;
    }

    public List<String> getBooks() {
      return books;
    }
  }

  static class Invoice {

    String customer;
    int amount;

    Invoice(String customer, int amount) {
      this.customer = customer;
      this.amount = amount;
    }

    public String getCustomer() {
      return customer;
    }

    public int getAmount() {
      return amount;
    }
  }

  static class Student {

    String name;
    String subject;
    int marks;

    Student(String name, String subject, int marks) {
      this.name = name;
      this.subject = subject;
      this.marks = marks;
    }

    public String getName() {
      return name;
    }

    public String getSubject() {
      return subject;
    }

    public int getMarks() {
      return marks;
    }

    @Override
    public String toString() {
      return name + " - " + marks;
    }
  }


  private static void question1() {
//    Group courses by category
//    For each category, find the total duration of all courses
    List<Course> courses = Arrays.asList(
        new Course("Java Basics", "Programming", 40),
        new Course("Advanced Java", "Programming", 60),
        new Course("UI/UX Design", "Design", 30),
        new Course("Graphic Design", "Design", 45),
        new Course("Data Structures", "Programming", 50)
    );

    System.out.println(
        courses
            .stream()
            .collect(
                Collectors.groupingBy(
                    Course::getCategory,
                    Collectors.summingInt(Course::getDuration)
                )
            )
    );

  }

  private static void question2() {
//    Create a flat list of all book titles
//    Sort alphabetically

    List<Author> authors = Arrays.asList(
        new Author("Alice", Arrays.asList("Book A", "Book B")),
        new Author("Bob", Arrays.asList("Book C")),
        new Author("Charlie", Arrays.asList("Book D", "Book E", "Book F"))
    );

    System.out.println(
        authors
            .stream()
            .flatMap(x -> x.getBooks().stream())
            .sorted()
            .toList()
    );


  }

  private static void question3() {
//    Group invoices by customer
//    For each customer, get the total amount
    List<Invoice> invoices = Arrays.asList(
        new Invoice("Alice", 300),
        new Invoice("Bob", 150),
        new Invoice("Alice", 200),
        new Invoice("Charlie", 400),
        new Invoice("Bob", 100)
    );

    System.out.println(
        invoices
            .stream()
            .collect(
                Collectors.groupingBy(
                    Invoice::getCustomer,
                    Collectors.summingInt(Invoice::getAmount)
                )
            )
    );

  }

  private static void question4() {
//    Group students by subject
//    For each subject, find the student with the highest marks
    List<Student> students = Arrays.asList(
        new Student("Alice", "Math", 85),
        new Student("Bob", "Math", 92),
        new Student("Charlie", "Science", 78),
        new Student("David", "Science", 88),
        new Student("Eva", "Math", 91)
    );

    System.out.println(
        students
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Student::getSubject,
                        Collectors.collectingAndThen(
                            Collectors.maxBy(Comparator.comparing(Student::getMarks)),
                            Optional::get
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
