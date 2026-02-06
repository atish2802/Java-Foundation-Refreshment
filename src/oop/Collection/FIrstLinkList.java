package com.Collection;

import java.util.LinkedList;

public class FIrstLinkList {
	public static void main(String[] args) {
		LinkedList<String> name = new LinkedList<>();
		name.add("Atish");
		name.add("Rupesh");
		name.add("Pratik");
		name.add("Sumbham");
		
		name.addFirst("Bhavesh");
		
		System.out.println(name);
		
		name.addLast("Pratap");
		System.out.println(name);
		
		System.out.println(name.remove());
		System.out.println(name);
		name.remove(3);
		System.out.println(name);
	}
}
