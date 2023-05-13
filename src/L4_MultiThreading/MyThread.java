package L4_MultiThreading;

public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println(currentThread());
    }
}
