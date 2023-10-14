package com.ashokit.threads.classlock;

public class HDFCBank {
	
	static int accountBalance=7000;
	
	public HDFCBank(int accountBalance) {
		// TODO Auto-generated constructor stub
		this.accountBalance=accountBalance;
	}
	
	synchronized static void withdraw(int withdrawalAmount) {
		accountBalance=accountBalance-withdrawalAmount;
	}
	
	synchronized static public void deposit(int amountToBeDeposited) {
		accountBalance=accountBalance+amountToBeDeposited;
	}
	
	synchronized public void balanceCheck() {
		System.out.println("Balance is "+this.accountBalance);
	}
	
	public static void profileUpdate() {
		System.out.println("Profile Update");
	}
	
	

}
