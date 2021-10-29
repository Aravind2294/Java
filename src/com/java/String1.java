package com.java;

public class String1 {

	public static void main(String[] args) {

		String s = "Welcome to java";

		int length = s.length(); // To calculate length
		System.out.println(length);

		boolean equals = s.equals("Welcome java"); // To check the string
		System.out.println(equals);

		boolean equalsIgnoreCase = s.equalsIgnoreCase("Welcome To Java");// To check the string even accept caps or
																			// small letter
		System.out.println(equalsIgnoreCase);

		String upperCase = s.toUpperCase(); // To change the string into caps
		System.out.println(upperCase);

		String lowerCase = s.toLowerCase(); // To change the string into small
		System.out.println(lowerCase);

		boolean startsWith = s.startsWith("W"); // To check the given string starts with W
		System.out.println(startsWith);

		boolean endsWith = s.endsWith("a"); // To check the given string ends with e
		System.out.println(endsWith);

		boolean contains = s.contains("z"); // To check the given character in that string
		System.out.println(contains);

		int indexOf = s.indexOf("a"); // To print the index of that string
		System.out.println(indexOf);

		int lastIndexOf = s.lastIndexOf("j"); // To print the last index of that string
		System.out.println(lastIndexOf);

		char charAt = s.charAt(13); // To print the index of the string character
		System.out.println(charAt);

		String replace = s.replace("to", "you"); // To replace one to another
		System.out.println(replace);

		String substring = s.substring(3); // To remove the character from that string
		System.out.println(substring);

		boolean empty = s.isEmpty(); // To check the string is empty
		System.out.println(empty);

		String[] split = s.split(" "); // Split the string
//		System.out.println(s);
		for (String string : split) {
			System.out.println(string);
		}

		String a = "     Java     "; // Remove unwanted space
		String trim = a.trim();
		System.out.println(trim);

		String concat = s.concat(a); // To adding two string
		System.out.println(concat);
	}
}
