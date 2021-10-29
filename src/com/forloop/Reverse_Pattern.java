package com.forloop;

import java.util.Scanner;

public class Reverse_Pattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int noOfRows = sc.nextInt();

//		int count = 1;
//		for (int i = 1; i <= noOfRows; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(count + " ");
//				count++;
//			}
//			System.out.println();
//		}

		for (int i = 1; i <= noOfRows; i++) {
			for (int k = 0; k >= i; k--) {
				System.out.println(" ");
			}
			int num = i;

			for (int j = 1; j <= i; j++) {
				System.out.print(num + "  ");

				num = num + 8 - j;
			}
			System.out.println();
		}
	}
}
