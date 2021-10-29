package com.java;

import java.util.Scanner;

public class Switch_Case {
	
 public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value");
	int num = s.nextInt();
	
	switch (num) {
	case 1:
		System.out.println("one");
		break;
	case 2:
		System.out.println("two");
		break;
	default:
		System.out.println("invalid");
		break;
	}
}
}
