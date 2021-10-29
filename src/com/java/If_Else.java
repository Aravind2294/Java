package com.java;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks = s.nextInt();
		int marks1 = s.nextInt();
		int marks2 = s.nextInt();

		if (marks < 50 && marks1 < 50 && marks2<50) {
			System.out.println("Fail");
		} else if (marks >= 50 && marks <= 60 && marks1 >= 50 && marks1 <= 60 && marks2 >= 50 && marks2 <= 60) {
			System.out.println("You Grade is:  B");
		} else if (marks >= 60 && marks <= 100 && marks1 >= 60 && marks1 <= 100 && marks2 >= 60 && marks2 <= 100) {
			System.out.println("You Grade is:  A");
		} else {
			System.out.println("Not Attend");
		}
	}
}