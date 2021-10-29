package com.webtask;

public class LanguageInfo1 extends StateDetails {

	@Override
	public void southIndia(int d) {
		super.southIndia(d);
	}

	@Override
	public void northIndia(int e) {
		super.northIndia(e);
	}

	public void tamilLanguage(int a) {
		System.out.println(a);
	}

	public void englishLanguage(int b) {
		System.out.println(b);
	}

	public void hindiLanguage(int c) {
		System.out.println(c);
	}

	public static void main(String[] args) {
		LanguageInfo1 l = new LanguageInfo1();
		l.southIndia(50);
		l.northIndia(70);
		l.tamilLanguage(20);
		l.englishLanguage(17);
		l.hindiLanguage(18);
	}
}