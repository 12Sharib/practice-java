package Streams.problems;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Aug4Classes {

  static class Employee {

    String name;
    String department;
    int experience;

    public Employee(String name, String department, int experience) {
      this.name = name;
      this.department = department;
      this.experience = experience;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getDepartment() {
      return department;
    }

    public void setDepartment(String department) {
      this.department = department;
    }

    public int getExperience() {
      return experience;
    }

    public void setExperience(int experience) {
      this.experience = experience;
    }
    // constructor, getters


    @Override
    public String toString() {
      return "Employee{" +
          "name='" + name + '\'' +
          ", department='" + department + '\'' +
          ", experience=" + experience +
          '}';
    }
  }

  static class Transaction {

    private String accountId;
    private double amount;

    // constructor, getters

    public Transaction(String accountId, double amount) {
      this.accountId = accountId;
      this.amount = amount;
    }

    public String getAccountId() {
      return accountId;
    }

    public double getAmount() {
      return amount;
    }
  }

  static class Student {

    String name;
    int marks;

    // constructor, getters
    public Student(String name, int marks) {
      this.name = name;
      this.marks = marks;
    }

    public String getName() {
      return name;
    }

    public int getMarks() {
      return marks;
    }
  }

  static class Book {

    String title;
    String author;
    int year;

    // constructor, getters
    public Book(String title, String author, int year) {
      this.title = title;
      this.author = author;
      this.year = year;
    }

    public String getTitle() {
      return title;
    }

    public String getAuthor() {
      return author;
    }

    public int getYear() {
      return year;
    }
  }


  private static void question1() {
//  From the list of employees, find the employee with the maximum experience in each department.
//  Return:
//  Map<String, Employee>
//  (i.e., department as key, most experienced employee as value)

    List<Employee> employees = List.of(
        new Employee("Alice", "HR", 3),
        new Employee("Bob", "HR", 5),
        new Employee("Charlie", "IT", 2),
        new Employee("David", "IT", 6),
        new Employee("Eva", "Sales", 4)
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
                                Collectors.maxBy(Comparator.comparing(Employee::getExperience)),
                                Optional::get
                            )
                    )
            )
    );


  }

  private static void question2() {
//    Using Stream API, group the transactions by accountId and calculate the total amount per account.
    List<Transaction> transactions = List.of(
        new Transaction("A101", 150.0),
        new Transaction("A102", 200.0),
        new Transaction("A101", 100.0),
        new Transaction("A103", 50.0),
        new Transaction("A102", 300.0)
    );

    System.out.println(
        transactions
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Transaction::getAccountId,
                        Collectors.summingDouble(Transaction::getAmount)
                    )
            )
    );

  }

  private static void question3() {
//     Using Stream API, find the name of the student with the highest marks.

    List<Student> students = List.of(
        new Student("Alice", 85),
        new Student("Bob", 92),
        new Student("Charlie", 78),
        new Student("David", 91)
    );

    System.out.println(
        students
            .stream()
            .max(Comparator.comparing(Student::getMarks))
            .get()
            .name
    );
  }

  private static void question4() {
//    Using Stream API, group the book titles by their publication year.
    List<Book> books = List.of(
        new Book("Effective Java", "Joshua Bloch", 2008),
        new Book("Java Concurrency in Practice", "Brian Goetz", 2006),
        new Book("Clean Code", "Robert C. Martin", 2008),
        new Book("Head First Java", "Kathy Sierra", 2005)
    );

    System.out.println(
        books
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Book::getYear,
                        Collectors
                            .mapping(
                                Book::getTitle, Collectors.toList()
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
