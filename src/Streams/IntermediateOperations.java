package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {

  private static void impl() {
    // intermediate operations converts one stream to another stream
    // They are lazy, meaning they don't execute until a terminal operation is invoked

    List<String> list = Arrays.asList("Sharib", "Saifi", "A");

//     1. Filter
    Stream<String> ans = list.stream().filter(x -> x.toLowerCase().startsWith("s"));
//     there is not filtering at this point

    ans.collect(Collectors.toList());
    // Now this is the terminal operation
    System.out.println(ans);

//    2. Map
    List<String> map = list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
    System.out.println(map);

//    3. Sorted Using this stream will sort in natural order
    List<String> sorted = list.stream().sorted().toList();
    System.out.println(sorted);

//  4.  Using this you can sort the streams with any order
    List<String> sortedStreamUsingComparator = list.stream().sorted().toList();
//    5. Distinct
    list.stream().filter(x -> x.startsWith("A")).distinct().count();

//     6. Limit for limit the data

    // 7. Skip
    System.out.println(Stream.iterate(1, x->x+1).skip(10).limit(100).count());

  }

  public static void main(String[] args) {
    impl();
  }

}
