package com.Collection;

import java.util.HashSet;

public class ExampleHashSet {
	public static void main(String[] args) {
		HashSet<String> city = new HashSet<String>();
		
		city.add("Vapi");
		city.add("mumbai");
		city.add("kalyan");
		city.add("bhopal");
		city.add("pune");
		city.add("Vapi");
		
		System.out.println("Cities : "+ city);
		
		for(String cities : city) {
			System.out.println(cities);
		}
	}
}
