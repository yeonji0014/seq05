package 제어문.반복문;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보문제2 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		total++;
		int win = 0;
		
		while (true) {
			int com = r.nextInt(3);
			System.out.print("me(0이면 가위, 1이면 바위, 2이면 보) >> ");
			int me = sc.nextInt();
			System.out.println(com + " " + me);
			if (me == 0) {
				if (com == 0) {
					System.out.println("무승부");
				}
				else if (com == 1) {
					System.out.println("컴퓨터 승");
				}
				else {
					System.out.println("내가 승");
					win++;
				}
			}
			else if (me == 1) {
				if (com == 0) {
					System.out.println("내가 승");
					win++;
				}
				else if (com == 1) {
					System.out.println("무승부");
				}
				else {
					System.out.println("컴퓨터 승");
				}
			}
			else {
				if (com == 0) {
					System.out.println("컴퓨터 승");
				}
				else if (com == 1) {
					System.out.println("내가 승");
					win++;
				}
				else {
					System.out.println("무승부");
				}
			}//else
			System.out.print("종료하실래요X?");
			String exit = sc.next();
			if (exit.equals("X")) {
				System.out.println("종료합니다.");
				System.out.println("전체 " + total + "중에 내가 승리한 수는 " + win);
				System.exit(0);
			}
		}//while
		
	
	}

}
