package com.Collection;

import java.util.HashMap;

public class HashMapExample1 {
		public static void main(String[] args) {
			HashMap<Integer, String> map = new HashMap<Integer, String>();
			
			map.put(101, "Atish");
			map.put(102, "Bhavesh");
			map.put(103, "RUpesh");
			
			// No order in this 
			System.out.println("Value of 101 : "+ map.get(101));
			System.out.println(map);
		}
}
