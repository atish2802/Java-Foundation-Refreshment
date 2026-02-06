package Java8.StreamAPI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class Sample {
	
	public interface Collectors {
		
		public String getNames();
		
	}
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Java","spring","SpringBoot");
		
		Stream<String> upper = names.stream().map(String::toUpperCase);
		
		
		
		List<Integer> list1 = List.of(2,3,4,5,6,6,43,42,34,37,24); //immutabal
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(17);
		list2.add(14);
		list2.add(10);
		list2.add(59);
		list2.add(27);
		list2.add(11);
		list2.add(67);
		

		List<Integer> list3 = Arrays.asList(11,22,33,44,55,66,34,45,67);//immutable
		
		
		List<Integer> evenList = new ArrayList<Integer>();
		
		for(Integer i : list1) {
			if(i % 2 ==0) {
				evenList.add(i);
			}
		}
		System.out.println(list1);
		System.out.println(evenList);
		
		
		Stream<Integer> stream = list1.stream();
		
		
		System.out.println(stream.count());
	}
}
