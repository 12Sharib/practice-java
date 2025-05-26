package Streams.problems;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class May27Classes {

  static class Person {

    private String name;


    public Person(String name, Integer age) {
      this.name = name;
      this.age = age;
    }

    public Integer getAge() {
      return age;
    }

    public String getName() {
      return name;
    }

    private Integer age;

    @Override
    public String toString() {
      return "Person{" +
          "name='" + name + '\'' +
          ", age='" + age + '\'' +
          '}';
    }
  }


  private static void question1() {
//  You have a list of people with name and age.
//  Group people by age group:
//  "Minor" if age < 18
//  "Adult" if age between 18 and 60
//   "Senior" if age > 60

    List<Person> people = Arrays.asList(
        new Person("Alice", 17),
        new Person("Bob", 25),
        new Person("Charlie", 70)
    );
//    {
//  Minor=[Alice],
//  Adult=[Bob],
//  Senior=[Charlie]
//}

    System.out.println(people
        .stream()
        .collect(Collectors.groupingBy(
            person -> {
              if (person.getAge() < 18) {
                return "Minor";
              } else if (person.getAge() > 18 && person.getAge() < 60) {
                return "Adult";
              } else {
                return "Senior";
              }
            }
        )));

  }

  public static void main(String[] args) {
    question1();
  }

}
