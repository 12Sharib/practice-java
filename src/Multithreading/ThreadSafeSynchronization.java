package Multithreading;

public class ThreadSafeSynchronization extends Thread{

  static class consumer extends Thread{
   public void run(){
     producer();
   }

  }
  static class consumerSecond extends Thread{
    public void run(){
      producer();
    }

  }

  private static synchronized void producer(){
    for (int i=0;i<10;i++){
      System.out.print(Thread.currentThread().getName() + " : " +  i  + " ");
    }
  }

  public static void main(String[] args) {
    Thread thead =new consumer();
    Thread threadsecond = new consumerSecond();


    thead.start();
    System.out.println(thead.getId());

    threadsecond.start();
    System.out.println(threadsecond.getId());

  }

}
