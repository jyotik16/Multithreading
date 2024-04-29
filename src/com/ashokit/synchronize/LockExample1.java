package com.ashokit.synchronize;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample1 {
	private Lock l= new ReentrantLock(true);//fair Lock
	//false or call the no arg constructor that is called un fair lock
	void display(LockExample1 d){
		//create the lock
		l.lock();
		display1(d);
		System.out.println("hi 1");
		System.out.println("hi 2");
		System.out.println("hi 3");
		System.out.println("hi 4");
		
	}
	void display1(LockExample1 d){
				
		System.out.println("hi 1");
		System.out.println("hi 2");
		System.out.println("hi 3");
		System.out.println("hi 4");
		l.unlock();
	}
	
	public static void main(String[] args) {
		LockExample1 d= new LockExample1();
		Thread t= new Thread(()->d.display(d));
		Thread t1= new Thread(()->d.display(d));
		Thread t2= new Thread(()->d.display(d));
		Thread t3= new Thread(()->d.display(d));
		
		t.start();
		t1.start();
		t2.start();
		t3.start();
		
	}
}
