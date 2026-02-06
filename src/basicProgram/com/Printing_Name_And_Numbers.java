package basicPrograms.in;

import java.util.Scanner;

public class Printing_Name_And_Numbers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Your Name and your Roll_No");
	String  name = sc.next();
	int roll_no = sc.nextInt();
	
	System.out.println("Hello, " + name + " Welocme in our Class , \n You can seet in bench no "+roll_no);
	
	
}
}
