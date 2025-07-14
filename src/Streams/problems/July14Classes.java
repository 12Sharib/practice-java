package Streams.problems;

import java.util.List;
import java.util.stream.Collectors;

public class July14Classes {

  static class Invoice {

    private String customer;
    private int amount;

    public Invoice(String customer, int amount) {
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

  private static void question1(){
//    Return a Map<String, Integer> — customer → total amount of all invoices for that customer.
    List<Invoice> invoices = List.of(
        new Invoice("Alice", 200),
        new Invoice("Bob", 300),
        new Invoice("Alice", 150),
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

  public static void main(String[] args) {
    question1();

  }

}
