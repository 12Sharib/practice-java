package Streams.problems;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class July13Classes {

  static class Product {

    private String name;
    private String category;
    private int price;

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


  private static void question1() {
//    Return a Map<String, String> — category → product name
//of the product with the highest price in each category.
    List<Product> products = List.of(
        new Product("TV", "Electronics", 30000),
        new Product("Laptop", "Electronics", 70000),
        new Product("Sofa", "Furniture", 40000),
        new Product("Table", "Furniture", 20000),
        new Product("Fan", "Electronics", 5000)
    );

    System.out.println(
        products
            .stream()
            .collect(
                Collectors
                    .groupingBy(
                        Product::getCategory,
                        Collectors.collectingAndThen(
                            Collectors.maxBy(Comparator.comparing(Product::getPrice)),
                            optprod -> optprod.get().name
                        )
                    )
            )
    );


  }

  public static void main(String[] args) {
    question1();

  }

}
