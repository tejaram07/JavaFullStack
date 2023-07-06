//CODE 1

class worker extends Thread {
  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.println("Thread 1 Running ....." + new java.util.Date());

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
public class Test0 {
  public static void main(String[] args) {
    worker w1 = new worker();
    w1.start();
  }
}


//CODE 2
class worker1 implemets Runnable {
  public void run() {
    for (int i = 1; i <= 20; i++) {
      System.out.println("Thread One is Working");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
class worker2 implemets Runnable {
  public void run() {
    for (int i = 1; i <= 20; i++) {
      System.out.println("Hello From Thread Two");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class Test1 {
  Thread t1, t2;
  Test1() {
    t1 = new Thread(new worker1());
    t2 = new Thread(new worker1());

    t1.setPriority(5);
    t2.setPriority(10);

    t1.start();
    t2.start();
  }
  public static void main(String[] args) {
    new Test1();
  }
}

