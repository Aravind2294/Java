package com.arav;

import java.util.Scanner;

public class Scanner1 {
	
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Insert Your Card");
	
	String nextLine = s.nextLine();
	System.out.println(nextLine);
	System.out.println("Enter Your Pin");
	
	int nextInt = s.nextInt();
	System.out.println(nextInt);
	System.out.println("Select your account");
	
	String next = s.next();
	System.out.println(next);
	System.out.println("Enter your amount");
	
	String nextLine2 = s.nextLine();
	System.out.println(nextLine2);
	System.out.println("YES");
	
	int nextInt2 = s.nextInt();
	System.out.println(nextInt2);
	
	
	
}
}
