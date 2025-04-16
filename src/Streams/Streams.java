package Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
  private static void impl(){
    // Streams
    // If you need to do some declarative and functional programming in collection I can use streams to convert
    // It is sequence of operations that support multiple functions


    // How to use?
    // Source, Intermediate operations and terminal operations

    List<Integer> numbers = Arrays.asList(2,5,6,7,8);

    long count = numbers.stream().filter(x -> x%2==0).count();
    System.out.println(count);

    // Creating streams
    // 1. Collections
//    List<Integer> numbers = Arrays.asList(2,5,6,7,8);
//    2. Arrays
    Integer [] integers = new Integer[4];
    Stream<Integer> streams = Arrays.stream(integers);
//    3. Stream.of()
    Stream<String> stream = Stream.of("Sharib");
//    4. Infinite Streams
    Stream<Integer> integerStream = Stream.generate(() -> 1);
    // Another way to create infinite streams
    Stream.iterate(1, x->x+1).limit(100).collect(Collectors.toList());

  }

  public static void main(String[] args) {
    impl();
  }

}
