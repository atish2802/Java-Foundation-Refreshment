package Java8.StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Method {
	public static void main(String[] args) {
		
		// Filter
		
		List<String> names = List.of("Aman","Jayesh","Rajesh","Bhupen","Atish","Abhay");
		
		List<String> stream =  names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		
		System.out.println(stream);
		
		
		//Map
		
		List<Integer> num = List.of(2,3,4,5,6,7,8);
		
		List<Integer> collect = num.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println(collect);
		
		
		//sort
		List<Integer> num1 = List.of(3,2,234,23,24,4,23,3523,23,25,0);
		
		num1.stream().sorted().forEach(System.out::println);
		
		
		//min
		
		Integer integer = num1.stream().min((x,y) -> x.compareTo(y)).get();
		System.out.println(integer);
		
		//max
		
		Integer integer2 = num1.stream().max((x,y) -> x.compareTo(y)).get();
		System.out.println(integer2);
		
	}
}
