package Streams.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class June10Classes {

  static class Product {

    String name;
    String category;
    int price;

    // Constructor + Getters
    public Product(String name, String category, int price) {
      this.name = name;
      this.category = category;
      this.price = price;
    }

    public String getName() {
      return name;
    }

    public String getCategory() {
      return category;
    }

    public int getPrice() {
      return price;
    }
  }

  static class Student {

    String name;
    int marks;
    String subject;

    // constructor, getters
    public Student(String name, int marks, String subject) {
      this.name = name;
      this.marks = marks;
      this.subject = subject;
    }

    public String getName() {
      return name;
    }

    public int getMarks() {
      return marks;
    }

    public String getSubject() {
      return subject;
    }
  }

  private static void question1() {
//     Group the products by category and get the total price per category.
    List<Product> products = Arrays.asList(
        new Product("Laptop", "Electronics", 800),
        new Product("TV", "Electronics", 600),
        new Product("T-Shirt", "Clothing", 30),
        new Product("Jeans", "Clothing", 50),
        new Product("Book", "Stationery", 20)
    );

    System.out.println(
        products
            .stream()
            .collect(
                Collectors.groupingBy(
                    Product::getCategory,
                    Collectors.summarizingInt(Product::getPrice)
                )
            )
    );

  }

  private static void question2() {
//    Write a stream operation to group students by subject and find the name of the top scorer in each subject.

    List<Student> students = List.of(
        new Student("Alice", 90, "Math"),
        new Student("Bob", 85, "Math"),
        new Student("Carol", 95, "Science"),
        new Student("Dave", 70, "Science"),
        new Student("Eve", 88, "English")
    );

    System.out.println(
        students
            .stream()
            .collect(
                Collectors.groupingBy(
                    Student::getSubject,
                    Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(Student::getMarks)),
                        student -> student.map(Student::getName).get()
                    )
                )
            )
    );

  }

  static class Order {
    String customer;
    int amount;

    public Order(String customer, int amount) {
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

  private static void question3(){
//    Write a Stream expression to group orders by customer and calculate the total amount spent by each customer.
    List<Order> orders = Arrays.asList(
        new Order("Alice", 250),
        new Order("Bob", 300),
        new Order("Alice", 450),
        new Order("Bob", 150),
        new Order("Charlie", 500)
    );

    System.out.println(
        orders
            .stream()
            .collect(
                Collectors.groupingBy(Order::getCustomer,
                    Collectors.summingInt(Order::getAmount))
            )
    );
  }



  public static void main(String[] args) {
//    question1();
//    question2();
    question3();

  }

}
