package com.ashokit.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ThreadPoolExample {
	
	public static void main(String[] args) {
		//java 1.5->Executor framework
		//Single Thread pool
		//cached thread pool
		//scheduled thread pool
		//fixed thread pool
		ExecutorService ex=Executors.newFixedThreadPool(3);
		
		ExecutorService executor = Executors.newFixedThreadPool(2,new ThreadFactory() {
			int counter =0;
			@Override
			public Thread newThread(Runnable r) {
				Thread t= new Thread(r);
				t.setName("Thread "+counter++);
				// TODO Auto-generated method stub
				return t;
			}
		});
				
		ex.execute(null);
		//ex.submit(null)
	}

}
