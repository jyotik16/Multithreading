package com.ashokit.threadpool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args){

        Customer c1 = new Customer("Karthik","12345ERT",124367L);
        Customer c2 = new Customer("Ankita","23345ERT",124367L);
        Customer c3 = new Customer("Gaurav","45345ERT",124367L);
        Customer c4 = new Customer("Aman","15645ERT",124367L);
        Customer c5 = new Customer("Avantika","88345ERT",124367L);
        Customer c6 = new Customer("Kiara","127845ERT",124367L);
        Customer c7 = new Customer("July","19945ERT",124367L);
        Customer c8 = new Customer("Babu","34345ERT",124367L);
        Customer c9 = new Customer("Jeevan","00345ERT",124367L);
        Customer c10 = new Customer("Ajwaan","12845ERT",124367L);

        List<Customer> customers = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10);

        ExecutorService ex = Executors.newFixedThreadPool(2);
       // Executor ex = Executors.newCachedThreadPool();

        for (int i = 0; i < customers.size(); i++) {
            TriggerEmailPolicy t = new TriggerEmailPolicy(customers.get(i));
            ex.execute(t);
        }
        ex.shutdown();
        //(working queue)blockingqueue->linkedblocking queue executor framework is use
    }
}
