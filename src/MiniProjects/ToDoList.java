package com.MiniProjects;

import java.util.LinkedList;
import java.util.Scanner;

public class ToDoList {
	public static void main(String[] args) {
		LinkedList<String> tasks = new LinkedList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Daily 5 Task : ");
		
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println("Task "+ i + " : " );
			tasks.add(sc.nextLine());
		}
		
		System.out.println("\n Your Tasks ");
		
		for(int i = 0 ; i < tasks.size();i++) {
			System.out.println(i + " : "+ tasks.get(i));
		}
		
		System.out.println("\n Enter the index of the element which you want to remove : ");
		
		int index = sc.nextInt();
		
			if(index >= 0 && index <  tasks.size() ) {
				tasks.remove(index);
				System.out.println("Tasks Removed ! ");
			}else {
				System.out.println("Invalid Index ");
			}
			
			System.out.println("\n Updated To-Do list");
			for(int i = 0 ; i < tasks.size();i++) {
				System.out.println(i + ". " + tasks.get(i));
			}
	}
}
