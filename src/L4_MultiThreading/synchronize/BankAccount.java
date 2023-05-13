package L4_MultiThreading.synchronize;

import java.util.concurrent.atomic.AtomicLong;

public class BankAccount {

    private int id;
    private String name;
    //private Long balance;
    private AtomicLong balance = new AtomicLong();

    public BankAccount(int id, String name, Long balance) {
        this.id = id;
        this.name = name;
        this.balance.set(balance);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AtomicLong getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance.set(balance);
    }

    public void withdrawal(Long amount) {
//        synchronized (this) {
//            this.balance -= amount;
//        }
          this.balance.addAndGet(-amount);
    }

    public void deposit(Long amount) {
//        synchronized (this) {
//            this.balance += amount;
//        }
       this.balance.addAndGet(amount);
    }
}
