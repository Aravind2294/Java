package com.webtask;

public class StateDetails {
	
	public void southIndia(int d) {
		System.out.println(d);
	}

	public void northIndia(int e) {
		System.out.println(e);
	}

	public static void main(String[] args) {
		StateDetails s = new StateDetails();
		s.southIndia(20);
		s.northIndia(30);
		LanguageInfo l = new LanguageInfo();
		l.tamil(15);
		l.english(22);
		l.hindi(17);
	}
}

class LanguageInfo {
	public void tamil(int x) {
		System.out.println(x);
	}
	public void english(int y) {
		System.out.println(y);
	}
	public void hindi(int z) {
		System.out.println(z);
	}
}
