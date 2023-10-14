package com.ashokit.basic;

public class ThreadExample extends Thread{

	ThreadExample(){
		super();
	}
	ThreadExample(String str){
		super(str);
	}
	//3 ways to create to create the thread
	//1. Extending Thread class
	//2. Implementing Runnable interface
	//3. Implementing Callable Interface
	//Thread States - New, Runnable, Running, Dead, Wait, Sleep, Blocked
	public static void main(String[] args) {
		ThreadExample t1= new ThreadExample("First Thread");//New//1000->t1,t2,t3,t4,t5
		//className refvariable= new className();
		ThreadExample t2= new ThreadExample("Second Thread");
		//t1.setName("ABC");
		//t2.setName("DEF");
		t1.start();//Thread-0	--It creates the Independent path of execution. 100->Runnable pool
		//t1.start();
		t2.start();//Thread-1
		//t2.setName("DEF");
		//Dual core//quad core//Core i3, i5 ,i7
		//Hard disk//SSD
		//single thread -> 10 hrs -100000
		//20 thread -> 20 mins ->100000
		//Disadvantage of a thread is we cannot re use the thread object after completion of Run method
		//Thread Pool -3 ->4 hrs
	}
	
	@Override
	public void run() {//Run -> Running state
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("Hi");
		System.out.println("Hi");
		
		salaryCalcuation();
	}
	//Dead
	
	void salaryCalcuation() {
		
	}
}
