package Streams.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class June8Classes {

  static class Student {

    String name;
    int marks;

    Student(String name, int marks) {
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

  static class Product {

    String name;
    int price;

    public Product(String name, int price) {
      this.name = name;
      this.price = price;
    }

    public String getName() {
      return name;
    }

    public int getPrice() {
      return price;
    }
  }


  private static void question1() {
//    , print the names of students who scored more than 75, sorted alphabetically.
    List<Student> students = Arrays.asList(
        new Student("Alice", 82),
        new Student("Bob", 55),
        new Student("Charlie", 73),
        new Student("Diana", 90)
    );

    System.out.println(students
        .stream()
        .filter(x -> x.getMarks() > 75)
        .sorted(Comparator.comparing(Student::getName))
        .map(x -> x.name)
        .toList());
  }

  private static void question2() {
//    Print the names of unique products (no duplicates based on name), sorted by their price in ascending
    List<Product> products = Arrays.asList(
        new Product("Laptop", 1000),
        new Product("Mouse", 50),
        new Product("Keyboard", 70),
        new Product("Monitor", 300),
        new Product("Laptop", 1000)
    );

    System.out.println(
        products
            .stream()
            .collect(
                Collectors.toMap(
                    Product::getName,
                    Function.identity(),
                    (p1, p2) -> p1
                )
            )
            .values().stream().sorted(Comparator.comparing(Product::getPrice))
            .map(Product::getName)
            .toList()
    );
  }


  public static void main(String[] args) {
//    question1();

    question2();
  }

}
