package Array.co.in;

public class PresentOrNot {
	public static void main(String[] args) {
		int [] arr = { 11,12,13,14,15,16,17,18};
		int target = 14;
		
		boolean found = false;
		for(int a : arr) {
			if(a == target) {
				found = true;
				break;
			}			
		}
		if(found) {
			System.out.println("Available !");
		}else {
			System.out.println("Not Available ");
		}
	}
}
