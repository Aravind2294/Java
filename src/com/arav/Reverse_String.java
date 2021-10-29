package com.arav;

public class Reverse_String {
	public static void main(String[] args) {
		String input = "find my reversal i am a sentance";

		byte[] strAsByteArray = input.getBytes();

		byte[] result = new byte[strAsByteArray.length];

		for (int i = 0; i < strAsByteArray.length; i++)
			result[i] = strAsByteArray[strAsByteArray.length - i - 1];

		System.out.println(new String(result));
	}
}
