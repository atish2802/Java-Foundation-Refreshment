package basicProgram.com;

public class StringManipulation {
	public static void main(String[] args) {
		String str = "Welcome java !";
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(2,5));
		System.out.println(str.startsWith("wel"));
		System.out.println(str.endsWith("!"));
		System.out.println(str.contains("come"));
		System.out.println(str.indexOf("l"));
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.replace("java", "Home"));
		System.out.println(str.trim());
		System.out.println(str.charAt(2));
		
	
		

		String s = "Hello";
		s = s.concat(" Atish");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" Bhai");
		System.out.println(sb);
		
		StringBuilder ss = new StringBuilder("Hello");
		ss.append("Sir !");
		System.out.println(ss);
		
		
		
		
		
	}
}
