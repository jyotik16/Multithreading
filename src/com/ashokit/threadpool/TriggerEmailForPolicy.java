package com.ashokit.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class TriggerEmailForPolicy implements Callable<Object> {
	
	
	private Customer c;
	TriggerEmailForPolicy(Customer c){
		this.c=c;
	}

	/*
	 * @Override public void run() { // TODO Auto-generated method stub
	 * Thread.currentThread().getName(); triggerEmail(c); }
	 */
	
	public void triggerEmail(Customer c) {
		List failureList= new ArrayList();
		try {
			//Thread.sleep(10);
		System.out.println("sendiend email to person");
		StringBuffer s= new  StringBuffer();
		s.append("Hi "+c.customerName);
		s.append("for policy number "+c.policyNumber+" premium is due and premium amount is "+c.premium);
		s.append(" please pay before the due date to avoid late charges");
		//"Y"
		c.setMessage(s.toString());
		}catch (Exception e) {
			failureList.add(e);
			// TODO: handle exception
		}
		//call the JAVA Mail API to trigger email
	}

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		Thread.currentThread().getName();
		triggerEmail(c);
		return c;
	}

}
