package practice;

import java.util.Scanner;

public class 제어문정리문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("시작값 입력: ");
		int n1 = sc.nextInt();
		System.out.print("종료값 입력: ");
		int n2 = sc.nextInt();
		System.out.print("점프값 입력: ");
		int n3 = sc.nextInt();

		int sum = 0;
		int sum2 = 0;

		for (int i = n1; i <= n2; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		for (int i = n1; i <= n2; i = i + n3) {
			sum2 = sum2 + i;
			if (sum2 > 100) {
				System.out.println(sum2);
				System.exit(0);
			}
		}

	}

}