package 배열기본;

import java.util.Arrays;

public class 배열기초확인문제2 {

	public static void main(String[] args) {
//		int[] arr = new int[200];
//		arr[0] = 1000;
//		arr[1] = 2000;
//		arr[2] = 3000;
//		arr[arr.length - 1] = 5000;
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		
//		System.out.println();
//		
//		double[] d = new double[300];
//		System.out.println(Arrays.toString(d));
//		d[0] = 10.1;
//		d[1] = 20.2;
//		d[2] = 20.2;
//		d[d.length - 1] = 50.5;
//		
//		for (int i = 0; i < d.length; i++) {
//			System.out.print(d[i] + " ");
//		}
//		
//		System.out.println();
		
		String[] trip = {"서울", "부산", "대구", "경기도", "강원도"};
		char[] color = {'r', 'g', 'b', 'y', 'p'};
		double[] tall = {155.1, 166.1, 177.7, 188.8, 199.9};
		
		System.out.println(Arrays.toString(trip));
		System.out.println(Arrays.toString(color));
		System.out.println(Arrays.toString(tall));
		
//		for (String s : trip) {
//			System.out.print(s + " ");
//		}
//		System.out.println();
//		for (char c : color) {
//			System.out.print(c + " ");
//		}
//		System.out.println();
//		for (double e : tall) {
//			System.out.print(e + " ");
//		}
	}

}
