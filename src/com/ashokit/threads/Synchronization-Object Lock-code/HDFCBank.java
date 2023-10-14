package com.ashokit.threads.Synchronization;

public class HDFCBank {
	
	int accountBalance;
	public HDFCBank(int accountBalance) {
		// TODO Auto-generated constructor stub
		this.accountBalance=accountBalance;
	}
	
	synchronized void withdraw(int withdrawalAmount) {
		accountBalance=this.accountBalance-withdrawalAmount;
	}
	
	synchronized public void deposit(int amountToBeDeposited) {
		accountBalance=this.accountBalance+amountToBeDeposited;
	}
	
	synchronized public void balanceCheck() {
		System.out.println("Balance is "+this.accountBalance);
	}
	
	public void profileUpdate() {
		System.out.println("Profile Update");
	}
	
	

}
