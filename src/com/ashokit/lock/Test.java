package com.ashokit.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {

    private final Lock lock = new ReentrantLock();

    public void performTask() {
        lock.lock(); // Acquire the lock
        try {
            // Perform the task here
            System.out.println("Performing the task...");
        } finally {
            // Do not release the lock here
        }
    }

    public void anotherTask() {
        // Do some work here
        System.out.println("Performing another task...");

        lock.unlock(); // Release the lock
    }

    public static void main(String[] args) {
        Test example = new Test();
        example.performTask();
        example.anotherTask();
    }
}

