package com.ashokit.lock;

public class VolatileExample extends Thread {

    private  boolean stop = false;

    public void run() {
        while (!stop) {
            System.out.println("Thread running...");
        }
        System.out.println("Thread stopped.");
    }

    public void stopThread() {
        stop = true;
    }

    public static void main(String[] args) throws Exception {
        VolatileExample thread = new VolatileExample();
        thread.start();
        Thread.sleep(1000);
        thread.stopThread();
    }
}
