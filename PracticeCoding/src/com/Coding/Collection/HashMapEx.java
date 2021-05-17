package com.Coding.Collection;

import java.util.HashMap;import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Hussain");
		map.put(2, "Sachin");
		map.put(3, "Ronaldo");
		map.put(4, "Atif");
		
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " "+m.getValue());
		}
		
	}
}
