package 배열기본;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[5];
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print((i + 1) + "숫자 입력>> ");
//			arr[i] = sc.nextInt();
//		}
//		System.out.println(arr[0] + arr[2]);
		
		String[] s = new String[3];
		for (int i = 0; i < s.length; i++) {
			System.out.print("입력: ");
			s[i] = sc.next();
		}
		System.out.println(s[0] + " 보다는 " + s[1]);
		
	}

}
