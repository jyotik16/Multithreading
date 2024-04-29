package com.ashokit.lock;

public class VolatileExample1 {
    //private volatile boolean flag = false;
    private boolean flag = false;

    public void setFlag(boolean value) {
        flag = value;
    }

    public void printFlag() {
        System.out.println("Flag value is: " + flag);
    }

    public static void main(String[] args) {
        VolatileExample1 example = new VolatileExample1();

        new Thread(() -> {
            example.setFlag(true);
        }).start();

        new Thread(() -> {
            while (!example.flag) {}
            example.printFlag();
        }).start();
    }
}

