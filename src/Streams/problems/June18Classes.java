package Streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class June18Classes {

  static class Book {

    String title;
    String author;

    Book(String title, String author) {
      this.title = title;
      this.author = author;
    }

    public String getTitle() {
      return title;
    }

    public String getAuthor() {
      return author;
    }

    @Override
    public String toString() {
      return title + " by " + author;
    }
  }

  static class Transaction {

    String type;     // "credit" or "debit"
    String user;
    int amount;

    Transaction(String type, String user, int amount) {
      this.type = type;
      this.user = user;
      this.amount = amount;
    }

    public String getType() {
      return type;
    }

    public String getUser() {
      return user;
    }

    public int getAmount() {
      return amount;
    }

    @Override
    public String toString() {
      return user + " - " + type + " - " + amount;
    }
  }

  private static void question1() {
//    Using Stream API:
//    Group the books by author
//    Collect a Map<String, List<String>> where:
//        Key = author
//        Value = list of book titles

    List<Book> books = Arrays.asList(
        new Book("The Alchemist", "Paulo Coelho"),
        new Book("Eleven Minutes", "Paulo Coelho"),
        new Book("1984", "George Orwell"),
        new Book("Animal Farm", "George Orwell"),
        new Book("Brida", "Paulo Coelho")
    );

    System.out.println(
        books
            .stream()
            .collect(
                Collectors.groupingBy(
                    Book::getAuthor,
                    Collectors.mapping(Book::getTitle, Collectors.toList())
                )
            )
    );

  }

  private static void question2() {
//    Group transactions by user
//For each user, get a Map<String, Integer> where:
//    key = "credit" or "debit"
//    value = total amount for that type

    List<Transaction> transactions = Arrays.asList(
        new Transaction("credit", "Alice", 100),
        new Transaction("debit", "Bob", 50),
        new Transaction("credit", "Alice", 200),
        new Transaction("debit", "Alice", 30),
        new Transaction("credit", "Bob", 70),
        new Transaction("debit", "Charlie", 20)
    );

    System.out.println(
        transactions
            .stream()
            .collect(
                Collectors.groupingBy(
                    Transaction::getUser,
                    Collectors.groupingBy(Transaction::getType,
                        Collectors.summingInt(Transaction::getAmount))
                )
            )
    );

  }

  public static void main(String[] args) {
//    question1();

    question2();
  }

}
