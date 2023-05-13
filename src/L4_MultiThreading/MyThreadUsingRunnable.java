package L4_MultiThreading;

public class MyThreadUsingRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }
}
