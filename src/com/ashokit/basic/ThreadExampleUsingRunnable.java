package com.ashokit.basic;

import java.util.List;

public class ThreadExampleUsingRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("hi");
		
	}
	
	public static void main(String[] args) {
		ThreadExampleUsingRunnable tr= new ThreadExampleUsingRunnable();
		Thread t=new Thread(tr);
		Thread t2=new Thread(tr);
		
		Thread t1=new Thread(new ThreadExampleUsingRunnable());
		Thread t3=new Thread(new ThreadExampleUsingRunnable());
		t1.start();
		t.start();
		
	}
	
	void display(List<Integer> l) {
		
	}

}
