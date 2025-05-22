package Streams.problems;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class May23Classes {

  static class Person {

    String name;
    int age;

    Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    private int getAge(){
      return age;
    }
    private String getName(){
      return name;
    }

    // constructor, getters
  }

  private static void question1() {
    List<Person> people = List.of(
        new Person("Alice", 23),
        new Person("Bob", 17),
        new Person("Charlie", 19),
        new Person("David", 16)
    );

//    Given a list of Person objects, return a list of names of people older than 18, sorted by age ascending.


//    Sort by name
    System.out.println(
        people
        .stream()
        .filter(person -> person.age > 18)
            .map(Person::getName)
            .sorted()
            .toList());

//    Sort by age

    System.out.println(
        people.stream()
            .filter(person -> person.getAge()>18)
            .sorted(Comparator.comparingInt(Person::getAge))
            .map(Person::getName)
            .toList()
    );

  }

  public static void main(String[] args) {
    question1();

  }


}
