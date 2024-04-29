package com.ashokit.SynchronizationObjectLockCode;


public class PhonePe extends Thread{
	private HDFCBank bankAccnt;
	public PhonePe(HDFCBank bankAccnt) {
		// TODO Auto-generated constructor stub
		this.bankAccnt=bankAccnt;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		bankAccnt.balanceCheck();
	}

}
