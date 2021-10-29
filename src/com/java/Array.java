package com.java;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
//		int arr[][] = { { 1, 3 }, { 5, 7 }, { 9, 11 } };
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
		Scanner sc = new Scanner(System.in);                      //Get the array elements from the user
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the number od columns: ");
		int column = sc.nextInt();

		int arr[][] = new int[rows][column];
		System.out.println("Enter the elements: ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array printed in matrix form:");      //Print the array in Matrix form
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int sum = 0, rowsum = 0, columnsum = 0;                   //Compute row-wise and sum of all elements
        for (int i = 0; i < rows; i++) {
            //int rowsum = 0;
            for (int j = 0; j < column; j++) {
                sum = sum + arr[i][j];
                rowsum = rowsum + arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum = " + rowsum);
        }
		for (int i = 0; i < column; i++) {                        //Compute column-wise sum
            //int columnsum = 0;
            for (int j = 0; j < rows; j++) {
            	columnsum = columnsum + arr[j][i];
            }
            System.out.println("Column " + (i + 1) + " sum = " + columnsum);
        }
        
        System.out.println("Sum of all elements = " + sum);
    }
	}