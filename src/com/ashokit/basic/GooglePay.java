package com.ashokit.basic;

public class GooglePay extends Thread{
	private HDFCBank bankAccnt;
	public GooglePay(HDFCBank bankAccnt) {
		// TODO Auto-generated constructor stub
		this.bankAccnt=bankAccnt;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			bankAccnt.deposit(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
