package com.ashokit.threads.classlock;

public class MainClass {
public static void main(String[] args) {
	
	
	
	
	ATMThread ATM= new ATMThread();
	ATM.setName("ATM Thread");
	
	GooglePay GooglePay= new GooglePay();
	GooglePay.setName("GooglePay Thread");
	
	ATM.start();
	GooglePay.start();
	/*PhonePe PhonePe= new PhonePe(karthikAccnt);
	PhonePe.setName("PhonePe Thread");
	NetBanking NetBanking= new NetBanking(karthikAccnt);
	NetBanking.setName("NetBanking Thread");*/
	/*PhonePe.start();
	NetBanking.start();*/
}
}
