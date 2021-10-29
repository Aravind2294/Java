package com.forloop;

public class Nested_For_Loop {

	public static void main(String[] args) {

//		for (int i = 0; i < 2; i++) {					 // increment
//			
//			for (int j = 0; j < 2; j++) {
//				System.out.print(i + " " + j);
//			}
//			System.out.println();
//			
//		}
//		for (int i = 2; i > 0; i--) {					//decrement
//			for (int j = 2; j > 0; j--) {
//				System.out.print(i + "" + j);
//			}
//			System.out.println();
//		}
		for (int i = 0; i < 2; i++) { 					// increment/decrement
			for (int j = 2; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}