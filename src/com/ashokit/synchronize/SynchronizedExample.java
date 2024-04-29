package com.ashokit.synchronize;

import java.util.concurrent.locks.Lock;

public class SynchronizedExample {
	
	synchronized void display(SynchronizedExample d){
		//create the lock
		Lock l;
		display1(d);
		System.out.println("hi 1");
		System.out.println("hi 2");
		System.out.println("hi 3");
		System.out.println("hi 4");
	}
	
	 void display1(SynchronizedExample d){
		 System.out.println("hi 1");
			System.out.println("hi 2");
			//release lock
		 synchronized(d) {
			 System.out.println("hi 3");
				System.out.println("hi 4");
		 }
	}
	 
	 public static void main(String[] args) {
		//class implements Runnable
		 //class c= new class
		 SynchronizedExample s= new SynchronizedExample();
		// String s1="ABC";
		  
		// Runnable l1=;			
		 Thread t= new Thread(()->{s.display1(s);
		 s.display(s);});
		 t.start();
		 Thread t2= new Thread(()->s.display1(s));
		 t2.start();
			/*
			 * Thread t= new Thread(new Runnable() {
			 * 
			 * @Override public void run() {
			 * 
			 * s.display1(s); } }); t.start();
			 */
		 
	}

}
