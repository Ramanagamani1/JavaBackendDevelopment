package L4_MultiThreading;

public class Main {

    public static void main(String[] args) {
       MyThread t = new MyThread();
       t.start();

       MyThreadUsingRunnable t1 = new MyThreadUsingRunnable();
       Thread thread = new Thread(t1);
       thread.start();
    }
}
