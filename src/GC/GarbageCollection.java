package GC;

public class GarbageCollection {
  static class CheckGc{

    protected void finalize(){
      System.out.println("GC is working");
    }
  }

  public static void main(String[] args) {
    CheckGc checkGc = new CheckGc();
    checkGc = null;

    System.gc();
  }

}
