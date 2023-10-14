package com.ashokit.threads.classlock;

class Account {
    private double balance = 0;
    private Object lock = new Object();

    public void deposit(double amount) {
        synchronized (lock) {
            balance += amount;
            System.out.println("Deposit of " + amount + " completed. New balance is " + balance);
            lock.notifyAll(); // notify all threads waiting on the lock
        }
    }

    public void withdraw(double amount) {
        synchronized (lock) {
            while (balance < amount) {
                System.out.println("Insufficient balance. Waiting for a deposit...");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " completed. New balance is " + balance);
        }
    }
}

class DepositThread implements Runnable {
    private Account account;
    private double amount;

    public DepositThread(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.deposit(amount);
    }
}

class WithdrawThread implements Runnable {
    private Account account;
    private double amount;

    public WithdrawThread(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}

public class BankExample {
    public static void main(String[] args) {
        Account account = new Account();
        Thread depositThread1 = new Thread(new DepositThread(account, 100));
        Thread depositThread2 = new Thread(new DepositThread(account, 200));
        Thread withdrawThread = new Thread(new WithdrawThread(account, 150));
        depositThread1.start();
        depositThread2.start();
        withdrawThread.start();
    }
}

