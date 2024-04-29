package com.ashokit.synchronize;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test extends Thread{
	
	public static void main(String[] args) {
		Test t= new Test();
		Test t1= new Test();
		Test t2= new Test();
		t.start();
		t1.start();
		t2.start();
	}
	
	Lock l= new ReentrantLock(true);
	public void display() {
		System.out.println("Hi");
		System.out.println("Hi1");
		System.out.println("Hi2");
		l.lock();
		System.out.println("Hello");
		System.out.println("Hello2 ");
		System.out.println("Hello3");
		l.unlock();
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Test t= new Test();
		display();
	}

}
