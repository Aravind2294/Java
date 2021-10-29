package com.java;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset1 {

	public static void main(String[] args) {
		Set<Integer> h = new LinkedHashSet<Integer>();
		h.add(57);
		h.add(56);
		h.add(59);
		h.add(0);
		System.out.println(h);

		Set<Object> h1 = new LinkedHashSet<Object>();
		h1.add(56);
		h1.add(59);
		h1.add(58.65);
		h1.add("Arav");
		h1.add('A');
		System.out.println(h1);

		int size = h.size();
		System.out.println(size);

		boolean remove = h.remove(56);
		System.out.println(h);

		boolean contains = h.contains(57);
		System.out.println(contains);

//		h.clear();
//		System.out.println(h);

//		h1.addAll(h);
//		System.out.println(h1);

//		h1.retainAll(h);
//		System.out.println(h1);

		h1.removeAll(h);
		System.out.println(h1);

		boolean empty = h.isEmpty();
		System.out.println(empty);

		boolean equals = h.equals(h1);
		System.out.println(equals);
	}
}
