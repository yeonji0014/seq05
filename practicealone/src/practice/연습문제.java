package practice;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = 0;
		int n2 = 0;
		int n3 = 0;

		while (true) {
			System.out.print("입력 1)아이유 2)유재석 3)방탄 4)종료>> ");
			int num = sc.nextInt();
			if (num == 1) {
				n1++;
			} else if (num == 2) {
				n2++;
			} else if (num == 3) {
				n3++;
			} else {
				System.out.println("종료합니다.");
				System.out.println("아이유 득표수>> " + n1 + "표");
				System.out.println("유재석 득표수>> " + n2 + "표");
				System.out.println("방탄 득표수>> " + n3 + "표");
				System.exit(0);
			}

		}

	}
}
