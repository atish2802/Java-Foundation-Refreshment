package com.Collection;

import java.util.LinkedHashMap;

public class LinkedHashSetProblem {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> marks = new  LinkedHashMap<String, Integer>();
		
		marks.put("math", 101);
		marks.put("Hindi", 102);
		marks.put("Scince", 103);
		
		 // ordered 
		System.out.println(marks);
	}
}
