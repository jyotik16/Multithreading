package com.ashokit.threadpool;

public class Customer {
    private String customerName;
    private String policyNumber;
    private Long premium;

    public Customer(String customerName, String policyNumber, Long premium) {
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

    public Long getPremium() {
        return premium;
    }

    public void setPremium(Long premium) {
        this.premium = premium;
    }
}
