package Array.co.in;

public class LargestOfArray {
	public static void main(String[] args) {
		int [] arr = {14,64,74,750,86,34,64,91,67,93};
		
		int max = arr[0];
		
		for(int i = 1 ; i < arr.length ; i++) {
			if(arr[i] > max ) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
