package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 랜덤평균 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] n2 = new int[1000];
		int sum = 0;
		
		for (int i = 0; i < 1000; i++) {
			n2[i] = r.nextInt(100);
			//System.out.println(n);
		}
		for (int x : n2) {
			sum = sum + x;
		}
		System.out.println(Arrays.toString(n2));
		
		System.out.println();
		
		System.out.println(sum + " " + (double)sum / n2.length);
		
		
		
	}

}
