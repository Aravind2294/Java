package com.forloop;

import java.util.Scanner;

public class Switch_Mobile {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Choose Mobile Model");
		System.out.println("Vivo V19, Oneplus 8, Iphone 11");
		String model = s.nextLine();
		
		switch (model) {
		case "Vivo V19":
			System.out.println("Price:30000\rversion:Android11\rFront Camera 32MP + 8MP\rRear Camera 48MP + 8MP + 2MP + 2MP\rRAM 8GB. Storage 256GB");
			break;
		case "Oneplus 8":
			System.out.println("Price:39999\rversion:Android11\rFront Camera 16MP\rRear Camera 48MP + 16MP + 2MP\rRAM 12GB · Storage 256GB");
			break;
		case "Iphone 11":
			System.out.println("Price:64,900\rversion:iOS v13.0\rFront Camera 12MP\rRear Camera 12MP + 12MP\rRAM 4GB · Storage 64GB");
			break;
		default:
			System.out.println("Your Model is not available here");
			break;
		}
	}
}
