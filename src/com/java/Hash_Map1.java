package com.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map1 {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "RollsRoyce");
		m.put(2, "BMW");
		m.put(3, "Mercedes-Benz");
		m.put(3, "Ford");
		m.put(null, "Audi");
		m.put(null, "Maserati");
		m.put(null, "Benz");
		m.put(4, null);
		m.put(5, null);
		System.out.println(m);

		int size = m.size();
		System.out.println(size);

		String string = m.get(null);
		System.out.println(string);

		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);

		Collection<String> values = m.values();
		System.out.println(values);

		boolean containsKey = m.containsKey(3);
		System.out.println(containsKey);

		boolean containsValue = m.containsValue("Java");
		System.out.println(containsValue);

		Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
	}
}
