package L4_MultiThreading.synchronize;

public class MyThread extends Thread{

    private boolean isDeposit;
    private Long amount;
    public BankAccount bankAccount;

    MyThread(boolean isDeposit, Long amount, BankAccount bankAccount){
        this.isDeposit = isDeposit;
        this.amount = amount;
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
         test2();
    }

    public void test()  {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (bankAccount) {
            System.out.println("Inside synchronized block - " + currentThread().getName());
            try {
                Thread.sleep(20000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(isDeposit) {
                bankAccount.deposit(amount);
            }
            else{
                bankAccount.withdrawal(amount);
            }

            System.out.println("Done the transaction, exiting bye.. " +
                    "" + currentThread().getName());  // Remainder section
        }
    }

    public void test2() {
        System.out.println("Inside synchronized block - " + currentThread().getName());
        try {
            Thread.sleep(20000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(isDeposit) {
            bankAccount.deposit(amount);
        }
        else{
            bankAccount.withdrawal(amount);
        }

        System.out.println("Done the transaction, exiting bye.. " +
                "" + currentThread().getName());  // Remainder section
    }

}
