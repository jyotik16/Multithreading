package com.ashokit.SynchronizationObjectLockCode;

public class NetBanking extends Thread{
	private HDFCBank bankAccnt;
	NetBanking(HDFCBank bankAccnt){
		this.bankAccnt=bankAccnt;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		bankAccnt.profileUpdate();
	}

}
