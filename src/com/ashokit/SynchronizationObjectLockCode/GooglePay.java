package com.ashokit.SynchronizationObjectLockCode;

public class GooglePay extends Thread{
	private HDFCBank bankAccnt;
	public GooglePay(HDFCBank bankAccnt) {
		// TODO Auto-generated constructor stub
		this.bankAccnt=bankAccnt;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		bankAccnt.deposit(5000);
	}

}
