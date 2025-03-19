package Multithreading;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

  public static void main(String[] args) {
//    RunnableThread runnableThread = new RunnableThread();
//
//    Thread thread = new Thread(runnableThread);
//    thread.start();

    System.out.println("Hello World");

    ThreadClass threadClass = new ThreadClass();
    threadClass.start();

    System.out.println(threadClass.getName());

    ThreadClass threadClass1 = new ThreadClass();
    threadClass1.start();

    System.out.println(threadClass1.getName());

    List<Integer> list = new LinkedList<>();
  }

}
