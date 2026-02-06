package com.Collection;

import java.util.ArrayList;

public class FirstArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(12);
		arr.add(13);
		arr.add(14);
		arr.add(15);
		
		arr.add(2, 20);
		arr.addFirst(4);
		
		
		for(int i = 0 ; i < arr.size();i++) {
			System.out.println(arr.get(i));
		
		}
		System.out.println(arr.contains(13));
		System.out.println(arr.contains(40));
		System.out.println(arr.containsAll(arr));
		arr.set(4, 14);
		arr.remove(0);	
		System.out.println(arr);
	
	}
}
