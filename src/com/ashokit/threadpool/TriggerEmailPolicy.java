package com.ashokit.threadpool;

public class TriggerEmailPolicy implements Runnable {
    private Customer c;

    public TriggerEmailPolicy(Customer c) {
        this.c = c;
    }

    @Override
    public void run() {
        triggerEmail(c);
    }
    private void triggerEmail(Customer c){
        System.out.println("sending email to "+c.getCustomerName()+" policyNumber "+c.getPolicyNumber()+" with premium is "+c.getPremium());
    }
}