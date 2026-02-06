package com.Collection;

import java.util.Vector;

public class FIrstVEctor {
	public static void main(String[] args) {
		Vector<String> name = new Vector<String>();
		
		name.add("Jay");
		name.add("parth");
		name.add("shubham");
		name.add("jay");
		
		System.out.println("Names : "+name);
		System.out.println(name.size());
	}
}
