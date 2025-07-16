package Streams.problems;

import Streams.problems.July15Classes.Employee;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class July16Classes {

  static class Student {

    private String name;
    private String section;
    private String grade;

    public Student(String name, String section, String grade) {
      this.name = name;
      this.section = section;
      this.grade = grade;
    }

    public String getName() {
      return name;
    }

    public String getSection() {
      return section;
    }

    public String getGrade() {
      return grade;
    }

    @Override
    public String toString() {
      return "Student{" +
          "name='" + name + '\'' +
          ", section='" + section + '\'' +
          ", grade='" + grade + '\'' +
          '}';
    }
  }

  static class Book {

    private String title;
    private String author;
    private double rating;

    public Book(String title, String author, double rating) {
      this.title = title;
      this.author = author;
      this.rating = rating;
    }

    public String getTitle() {
      return title;
    }

    public String getAuthor() {
      return author;
    }

    public double getRating() {
      return rating;
    }
  }

  static class Order {
    private String customer;
    private String item;
    private String city;

    public Order(String customer, String item, String city) {
      this.customer = customer;
      this.item = item;
      this.city = city;
    }

    public String getCustomer() { return customer; }
    public String getItem() { return item; }
    public String getCity() { return city; }
  }

  private static void question1() {
//   Return a Map<String, Map<String, List<Student>>> —
//  Group students first by grade, then by section.

    List<Student> students = List.of(
        new Student("Alice", "A", "X"),
        new Student("Bob", "B", "X"),
        new Student("Charlie", "A", "Y"),
        new Student("David", "B", "Y"),
        new Student("Eve", "A", "X")
    );
    System.out.println(
        students
            .stream()
            .collect(
                Collectors.groupingBy(
                    Student::getGrade,
                    Collectors.groupingBy(
                        Student::getSection
                    )
                )
            )
    );

  }

  private static void question2() {
//   Return a Map<String, String> — author → title
//  of the book with the highest rating for each author.
    List<Book> books = List.of(
        new Book("Java Basics", "Alice", 4.2),
        new Book("Advanced Java", "Alice", 4.8),
        new Book("Spring Boot", "Bob", 4.5),
        new Book("Hibernate Guide", "Bob", 4.1),
        new Book("Clean Code", "Charlie", 4.9)
    );

    System.out.println(
        books
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Book::getAuthor,
                        Collectors.collectingAndThen(
                            Collectors
                                .maxBy(Comparator.comparing(Book::getRating)),
                            optbook -> optbook.get().title
                        )
                    )
            )
    );

  }

  private static void question3(){
//   Return a Map<String, List<String>> — city → list of customers
//  (no duplicates).
    List<Order> orders = List.of(
        new Order("Alice", "Laptop", "Delhi"),
        new Order("Bob", "Phone", "Mumbai"),
        new Order("Charlie", "Tablet", "Delhi"),
        new Order("Alice", "Phone", "Mumbai"),
        new Order("David", "Laptop", "Delhi")
    );

    System.out.println(
        orders
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Order::getCity,
                        Collectors.mapping(Order::getCustomer, Collectors.toSet())
                    )
            )
    );

  }

  public static void main(String[] args) {
//    question1();
//    question2();
    question3();

  }

}
