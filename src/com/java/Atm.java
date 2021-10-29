package com.java;

import java.util.Scanner;

public class Atm {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println("Insert your card");
		String Card = s.nextLine();
		System.out.println(Card);
		
//		System.out.println("Enter your pin");
//		int pin = s.nextInt();
//		System.out.println(pin);
//		
		System.out.println("Enter your account type");
		System.out.println("savings");
		System.out.println("current");
		
		String acc = s.next();
		System.out.println("Account type:" + acc);
				
		System.out.println("Select banking");
		System.out.println("Cash withdrawl");
		System.out.println("Cash deposit");
		System.out.println("Balance enquiry");
		String banking = s.next();
		System.out.println("you choose:" + banking);
		
		System.out.println("Enter your amount");
		String amount = s.next();		
		System.out.println("Your amount:"+amount);		
		System.out.println("Please wait for your transation");
		System.out.println("collect your amount");		
		System.out.println("Do you want Receipt?");
		System.out.println("Yes (or) No");
		String receipt = s.next();
		System.out.println(receipt);
		System.out.println("Thank you for your transaction");
		System.out.println("Visit again");
	}
}
