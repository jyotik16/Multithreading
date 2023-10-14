package com.ashokit.basic;

public class ATMThread extends Thread{
	private HDFCBank bankAccnt;
	ATMThread(HDFCBank bankAccnt){
		this.bankAccnt=bankAccnt;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			bankAccnt.withdraw(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
