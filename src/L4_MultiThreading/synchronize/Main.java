package L4_MultiThreading.synchronize;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        BankAccount bankAccount = new BankAccount(1, "Test_account", 5000l);

        MyThread thread1 = new MyThread(true,500l,bankAccount);
        MyThread thread2 = new MyThread(false,300l,bankAccount);

        long start = System.currentTimeMillis();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(bankAccount.getBalance());

        long end = System.currentTimeMillis();

        System.out.println("Time taken = " + (end - start));
    }
}
