package com.ashokit.threads.classlock;

public class GooglePay extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		HDFCBank.profileUpdate();
	}

}
