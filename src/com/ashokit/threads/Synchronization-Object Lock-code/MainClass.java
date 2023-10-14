package com.ashokit.threads.Synchronization;

public class MainClass {
public static void main(String[] args) {
	
	HDFCBank karthikAccnt=new HDFCBank(7000);
	System.out.println(karthikAccnt.hashCode());
	HDFCBank ShankarAccnt=new HDFCBank(10000);
	System.out.println(ShankarAccnt.hashCode());
	ATMThread ATM= new ATMThread(karthikAccnt);
	ATM.setName("ATM Thread");
	
	GooglePay GooglePay= new GooglePay(ShankarAccnt);
	GooglePay.setName("GooglePay Thread");
	
	/*PhonePe PhonePe= new PhonePe(karthikAccnt);
	PhonePe.setName("PhonePe Thread");
	NetBanking NetBanking= new NetBanking(karthikAccnt);
	NetBanking.setName("NetBanking Thread");*/
	
	ATM.start();
	GooglePay.start();
	/*PhonePe.start();
	NetBanking.start();*/
}
}
