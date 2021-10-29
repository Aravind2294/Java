package com.java;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Entertainment_Plans_list");
	    String n = s.nextLine();
		
	  switch (n) {
	case "netflix":
		System.out.println("Mobile= 199,Quality=Good,RES=480p,Devices=Mobiles,tab");
		System.out.println("Basic=499,Quality=Good,RES=480p,Devices=Mobiles,tab,computer,TV");
		System.out.println("Standard=649,Quality=Better,RES=1080p,Devices=Mobiles,tab,computer,TV");
		System.out.println("Premium=799,Quality=Best,RES=HDR+4K,Devices=Mobiles,tab,computer,TV,");
		break;
	case"amazon":
		System.out.println("Get 3 months of prime at 329 Rs");
        System.out.println("join prime at 999 Rs per year");
        System.out.println("Benfits=Free Delivery,Free one day  delivery");
        System.out.println("prime access Early,prime video,prime music,kindle book");
        System.out.println("Gameing offer,prime exculsive deals,Discounted");
        break;
	case"HBO":
         System.out.println("HBO MAX");
         System.out.println("ONE month without ads for 1114.05 Rs");
         System.out.println("ONE month with ads for 742.70 Rs");
         System.out.println("Benfits=Stream 4k content,watch any of the same-day Warner Bros .Movie Relase ");
         break;
	case "Zoro":
		System.out.println("ANIMA");
		System.out.println("YOU can watch the animation using the ZORO.to app ");
		System.out.println("Its have lot animation");
	default:
		System.out.println("sorry we can  collect more application source   ");
		break;
	}
		
}
}