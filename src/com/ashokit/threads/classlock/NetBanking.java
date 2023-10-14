package com.ashokit.threads.classlock;

public class NetBanking extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		HDFCBank.deposit(8000);
	}

}
