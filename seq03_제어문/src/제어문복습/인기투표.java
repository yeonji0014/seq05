package 제어문복습;

import java.util.Scanner;

public class 인기투표 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v1 = 0;
		int v2 = 0;
		int v3 = 0;
		
		while (true) {
			System.out.print("입력 1)아이유 2)유재석 3)방탄 4)종료>> ");
			int vote = sc.nextInt();
			switch (vote) {
			case 1:
				v1++;
				break;
			case 2:
				v2++;
				break;
			case 3:
				v3++;
				break;
			default:
				break;
			}if (vote == 4) {
				System.out.println("1번 득표수: " + v1 + ", 2번 득표수: " + v2 + ", 3번 득표수: " + v3);
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
		
		
		
	}

}
