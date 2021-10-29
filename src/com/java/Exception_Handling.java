package com.java;

public class Exception_Handling {

	public static void main(String[] args) {
		int a = 10, b = 0;
		try {
			System.out.println(a / b);
		} catch (Exception e) {
			e.printStackTrace();
		} //finally {
			//System.out.println("Java");
		//}
		System.out.println("Java");
	}
}
