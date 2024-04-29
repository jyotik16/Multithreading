package com.ashokit.synchronize;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    private Lock fairLock = new ReentrantLock(true); // create a fair lock
    private Lock unfairLock = new ReentrantLock(); // create an unfair lock

    public void performTask(Lock lock) {
        lock.lock(); // acquire the lock

        try {
            System.out.println("Task started by thread " + Thread.currentThread().getName());
            Thread.sleep(1000); // simulate some work
            System.out.println("Task completed by thread " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // release the lock
        }
    }

    public static void main(String[] args) {
        LockExample example = new LockExample();

        // create and start multiple threads to perform the task
        Thread thread1 = new Thread(() -> example.performTask(example.fairLock), "Thread 1");
        Thread thread2 = new Thread(() -> example.performTask(example.fairLock), "Thread 2");
        Thread thread3 = new Thread(() -> example.performTask(example.fairLock), "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

