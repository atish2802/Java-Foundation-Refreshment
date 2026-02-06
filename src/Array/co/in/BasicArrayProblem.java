package Array.co.in;

public class BasicArrayProblem {

	public static void main(String[] args) {
		
//		int[] paisa = {5,10,12,4,53};
		
		
//		int [] paisa = new int[5];
//		paisa[0] = 5; 
//		paisa[1] = 10;
//		paisa[2] = 15;
//		paisa[3] = 29;
//		paisa[4] = 20;	
//		System.out.println(paisa[3]);
		
		
		
		// total ke liye 
//		int[]  num = { 12,34,54,54,64};
//		
//		int total = 0;
//		for( int i = 0 ; i < 5 ; i++) {
//			total = total + num[i];
//		}
//		System.out.println(total);
//		
		
		
//		int num [] = {12,34,45,32,24,25,52};
//		
//		int max = num[0];
//		for(int i = 0 ; i < num.length ; i++) {
//			if(num[i] > max) {
//				max = num[i];
//			}
//		}
//		
//		System.out.println("The largest number is "+ max);
		
		
		int [] num = { 12, 34,23,21,45};
		
		int total = 0 ;
		
		for(int i = 0 ; i < 5 ; i++) {
			total = total +num[i];
		}
		System.out.println("Total Marks : "+ total);
	}
}

