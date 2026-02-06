package Array.co.in;

public class JaggedArray {
	public static void main(String[] args) {
		int [][] arr = new int[3][];
		
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[1];
		
		arr[0][0] = 00;
		arr[0][1] = 01;
		
		arr[1][0] = 10;
		arr[1][1] = 11;
		arr[1][2] = 12;
		
		arr[2][0] = 20;
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
