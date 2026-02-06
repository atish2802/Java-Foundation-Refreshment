package Array.co.in;

public class EvenOddArray {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int even = 0 , odd = 0 ;
		
		 for(int i :arr) {
			 if(i % 2 == 0) {
				 System.out.println("Even" +i);
				 even++;
			 }else {
				 System.out.println("Odd" + i);
				 odd++;
			 }
		 }
			System.out.println("Even: " +even);
			System.out.println("Odd : "+odd);
	}
}
