package com.arav;

import java.util.Scanner;

public class StringFormatter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int noOfRows = sc.nextInt();
		int i, j, k = 1;
		// inner loop
		for (i = 1; i <= noOfRows; i++) {
			// outer loop
			for (j = 1; j < i + 1; j++) {
				// prints the value of k
				System.out.print(k++ + " ");
			}
			// throws the cursor at the next line
			System.out.println();
		}
	}
}
