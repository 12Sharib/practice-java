package Streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class June13Classes {

  record Transaction(String category, int amount) {

  }

  record Student(String name,
                 String subject,
                 int marks) {

  }

  private static void question1() {

//    Group the transactions by category and calculate the total amount spent in each category using Streams.

    List<Transaction> transactions = Arrays.asList(
        new Transaction("Grocery", 150),
        new Transaction("Utilities", 80),
        new Transaction("Grocery", 100),
        new Transaction("Entertainment", 200),
        new Transaction("Utilities", 70)
    );

    System.out.println(
        transactions
            .stream()
            .collect(
                Collectors.groupingBy(
                    Transaction::category,
                    Collectors.summingInt(Transaction::amount)
                )
            )
    );

  }

  private static void question2(){
//    Group students by subject and calculate the average marks per subject.
    List<Student> students = Arrays.asList(
        new Student("Alice", "Math", 80),
        new Student("Bob", "Math", 90),
        new Student("Charlie", "Science", 85),
        new Student("David", "Science", 95)
    );
      System.out.println(
          students
              .stream()
              .collect(
                  Collectors.groupingBy(
                      Student::subject,
                      Collectors.averagingInt(Student::marks)
                  )
              )
      );



  }


  public static void main(String[] args) {
//    question1();
    question2();


  }

}
