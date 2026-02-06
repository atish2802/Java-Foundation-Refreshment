package com.Collection;

import java.util.Stack;

public class ExampleStack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("Book1");
		stack.push("Book2");
		stack.push("Book3");
		stack.push("Book4");
		
		System.out.println("Top task : " + stack.peek());
		System.out.println("Remove task ; " + stack.pop());
		System.out.println("New top task : "+ stack.peek());
	}
}
