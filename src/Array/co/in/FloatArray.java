package Array.co.in;

public class FloatArray {
	public static void main(String[] args) {
		float [] arr = {1.9f,2.91f,3.02f,4.0f,5.54f};
		float sum = 0;
		for(float a : arr) {
			
			sum += a;
		}
		System.out.println(sum);
	}
}
