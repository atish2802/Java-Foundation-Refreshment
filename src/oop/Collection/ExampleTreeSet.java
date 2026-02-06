package com.Collection;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExampleTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> num = new TreeSet<Integer>();
		
		num.add(13);
		num.add(14);
		num.add(10);
		num.add(11);
		num.add(12);
		num.add(2);
		num.add(1);
		num.add(5);	
		
		for(int i : num) {
			System.out.println("Sorted number : "+ i);
		}
		
	}
}
