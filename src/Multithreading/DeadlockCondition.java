package Multithreading;

public class DeadlockCondition {

  public static void main(String[] args) {
    final String resource1 = "foo";
    final String resource2 = "bar";
    Thread t1 = new Thread(() -> {
      synchronized (resource1) {
        System.out.println("Thread 1: locked resource 1");

        synchronized (resource2) {
          System.out.println("Thread 1: locked resource 2");
        }
      }
    });

    // t2 tries to lock resource2 then resource1
    Thread t2 = new Thread() {
      public void run() {
        synchronized (resource2) {
          System.out.println("Thread 2: locked resource 2");


          synchronized (resource1) {
            System.out.println("Thread 2: locked resource 1");
          }
        }
      }
    };

    t1.start();
    t2.start();
  }
}
