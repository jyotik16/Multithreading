package com.ashokit.threadpool;

public class Customer {
	
	String customerName;
	String policyNumber;
	String message;
	double premium;
	
	public Customer(String customerName, String policyNumber, double premium) {
		super();
		this.customerName = customerName;
		this.policyNumber = policyNumber;
		this.premium = premium;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	
	

}
