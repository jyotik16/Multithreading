package com.ashokit.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class MultiThreadingForInsurance1 {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//IRDA - 12 PM-> 4 AM
		//100=Select * from policy where PROCESS_SW is null or PROCESS_SW='EX'
		Customer c= new Customer("Karthik", "PL9451", 100000.00);
		Customer c1= new Customer("Harish", "PL9452", 200000.00);
		Customer c2= new Customer("Ashok", "PL9453", 10000.00);
		Customer c3= new Customer("Shankar", "PL9454", 1000.00);
		Customer c4= new Customer("Ganesh", "PL9455", 500000.00);
		Customer c5= new Customer("Naveen", "PL9456", 60000.00);
		Customer c6= new Customer("Ravi", "PL9457", 7000.00);
		Customer c7= new Customer("Raju", "PL9458", 800000.00);
		Customer c8= new Customer("Jhon", "PL9459", 5000.00);
		
		List<Customer> customerList=new ArrayList<>();
		customerList.add(c);
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		customerList.add(c4);
		customerList.add(c5);
		customerList.add(c6);
		customerList.add(c7);
		customerList.add(c8);
		
		String s=display();
		List<ScheduledFuture<Object>> l= new ArrayList();
		ScheduledExecutorService ex1=Executors.newScheduledThreadPool(2);
		for (int i = 0; i < customerList.size(); i++) {
			
			TriggerEmailForPolicy t= new TriggerEmailForPolicy(customerList.get(i));
			
			  ScheduledFuture<Object> tx= ex1.schedule(t, 2, TimeUnit.MINUTES);
			  l.add(tx);
			 
			
			//l.add(ex1.schedule(t, 2, TimeUnit.MINUTES));
			//ScheduledFuture<V> ex1.scheduleAtFixedRate(t, 2, 4, TimeUnit.MINUTES);
			//Future<Object> obj =ex1.submit(t);
			//l.add(obj);
			//start()
		}
		for (int i = 0; i < l.size(); i++) {

			ScheduledFuture<Object> ob= l.get(i);
			//ob.get();

			if(l.get(i).isDone()) {
				try { System.out.println(l.get(i).get()); 
				} catch(InterruptedException | ExecutionException e) {
					// TODO Auto-generated catch
					e.printStackTrace(); 
				} 
			}

		}
		
		
		
		
		
		
		
		
		ex1.shutdown();
		
		//10 hrus -
		//thread pool-4- 2.5
		/*
		 * for (int i = 0; i < customerList.size(); i++) { triggerEmail(); }
		 */
		
		
		
	}
	public static String display() {
		return "hi";
	}

}
