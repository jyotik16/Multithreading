package com.ashokit.threads.classlock;

public class ATMThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		HDFCBank.withdraw(10000);
	}

}
