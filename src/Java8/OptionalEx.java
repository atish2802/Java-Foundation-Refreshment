package Java8;

import java.util.Optional;

public class OptionalEx {
	public static void main(String[] args) {
		
		String string = "This is Optional Class";
		
		
		Optional<String> optional = Optional.ofNullable(string);
		
		
		System.out.println(optional.isEmpty());
		
		System.out.println(optional.isPresent());
		
		
		
		String s = null;
		Optional<String>optional2 = Optional.ofNullable(s);
		System.out.println(optional2.orElse("no value "));
	}
}
