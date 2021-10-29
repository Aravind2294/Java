package com.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class Book {
	int id, quantity;
	String name, author;

	public Book(int id, String name, String author, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.quantity = quantity;
	}

	public static void main(String[] args) {

		Map<Integer, Book> m = new LinkedHashMap<Integer, Book>();
		// Creating Books
		Book b1 = new Book(101, "The Art of Happiness", "Dalai Lama", 3);
		Book b2 = new Book(102, "The Four Agreements", "Don Miguel Ruiz", 4);
		Book b3 = new Book(103, "Screw It Lets Do It", "Richard Branson", 6);

		// Adding Books to map
		m.put(1, b1);
		m.put(2, b2);
		m.put(3, b3);

		// Traversing map
		for (Map.Entry<Integer, Book> entry : m.entrySet()) {
			int key = entry.getKey();
			Book b = entry.getValue();
			System.out.println(key + " Details:");
			System.out.println(b.id + ", " + b.name + ", " + b.author + ", " + " " + b.quantity);
		}
	}
}