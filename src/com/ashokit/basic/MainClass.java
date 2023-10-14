package com.ashokit.basic;

public class MainClass {
public static void main(String[] args) {
	
	HDFCBank karthikAccnt=new HDFCBank(7000);
	System.out.println(karthikAccnt.hashCode());
	
	HDFCBank ShankarAccnt=new HDFCBank(10000);
	HDFCBank ABC=new HDFCBank(100);
	
	ATMThread ABC1= new ATMThread(ABC);
	
	ATMThread ATM= new ATMThread(karthikAccnt);
	ATMThread ATM2= new ATMThread(karthikAccnt);
	ATM.setName("ATM Thread");
	ATM2.setName("ATM2 Thread");
	ABC1.setName("ABC1");
	GooglePay GooglePay= new GooglePay(karthikAccnt);
	GooglePay.setName("GooglePay Thread");
	
	ATM.start();
	ATM2.start();
	GooglePay.start();
	System.out.println(GooglePay.isAlive());
	ABC1.start();
	
	System.out.println(GooglePay.isAlive());
	/*PhonePe PhonePe= new PhonePe(karthikAccnt);
	PhonePe.setName("PhonePe Thread");
	NetBanking NetBanking= new NetBanking(karthikAccnt);
	NetBanking.setName("NetBanking Thread");*/
	/*PhonePe.start();
	NetBanking.start();*/
}
}
