package Java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public interface Collect {
	public static void main(String[] args) {
		
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Atish");
		name.add("Jayesh");
		name.add("Sahil");
		name.add("Poonam");
		name.add("Jagdish");
		
		System.out.println(name);
	
		
		List<Integer> even = new ArrayList<Integer>();
		even.add(1);
		even.add(2);
		even.add(3);
		even.add(4);
		even.add(5);
		even.add(6);
		
		
		System.out.println(even);
		
		for(int i : even) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	
		
		List<Integer> num1 = List.of(1,2,3,4,5,6);
		Stream <Integer> stream = num1.stream();
		
		List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());	
		System.out.println(newList);
	}	
}
