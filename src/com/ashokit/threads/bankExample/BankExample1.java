package com.ashokit.threads.bankExample;

class Account {
    private double balance = 0;

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " completed. New balance is " + balance);
        notifyAll();; // notify a single thread waiting on this object's monitor
    }

    public synchronized void withdraw(double amount) {
        while (balance < amount) {
            System.out.println("Insufficient balance. Waiting for a deposit...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("Withdrawal of " + amount + " completed. New balance is " + balance);
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

public class BankExample1 {
    public static void main(String[] args) {
        Account account = new Account();
        Thread depositThread1 = new Thread(new DepositThread(account, 100));
        Thread withdrawThread1 = new Thread(new WithdrawThread(account, 200));
        Thread withdrawThread = new Thread(new WithdrawThread(account, 150));
        depositThread1.start();
        withdrawThread1.start();
        withdrawThread.start();
    }
}

