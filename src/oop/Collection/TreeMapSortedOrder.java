package com.Collection;

import java.util.TreeMap;

public class TreeMapSortedOrder {
	public static void main(String[] args) {
		TreeMap<Integer,String> tree = new TreeMap<Integer, String>();
		
		tree.put(2,"Banana");
		tree.put(3,"Apple");
		tree.put(1, "Orange");
		tree.put(5, "Beet");
		tree.put(4, "Kivi");
		
		//sorted and ordered
		System.out.println(tree);
	}
}
