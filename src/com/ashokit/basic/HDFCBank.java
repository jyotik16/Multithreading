package com.ashokit.basic;

public class HDFCBank {
	
	int accountBalance;
	public HDFCBank(int accountBalance) {
		// TODO Auto-generated constructor stub
		this.accountBalance=accountBalance;
	}
	
	void withdraw(int withdrawalAmount) throws InterruptedException {
		
		if(accountBalance<withdrawalAmount) {
			wait();
			
		}
		accountBalance=this.accountBalance-withdrawalAmount;
	}
	
	public void deposit(int amountToBeDeposited) throws InterruptedException {
		
		
		accountBalance=this.accountBalance+amountToBeDeposited;
		notifyAll();
		System.out.println("hi");
	}
	
	synchronized public void balanceCheck() {
		System.out.println("Balance is "+this.accountBalance);
	}
	
	public void profileUpdate() {
		System.out.println("Profile Update");
	}
	
	

}
