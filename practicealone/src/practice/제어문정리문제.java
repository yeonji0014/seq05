package practice;

import java.util.Scanner;

public class 제어문정리문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("id: ");
		String id = sc.next();
		System.out.print("pw: ");
		String pw = sc.next();

		if (id.equals("root") && pw.equals("1234")) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}

		System.out.print("사과 구매 갯수: ");
		int appleCount = sc.nextInt();
		System.out.print("사과 한 개당 가격: ");
		int applePrice = sc.nextInt();
		System.out.print("딸기 구매 갯수: ");
		int strawCount = sc.nextInt();
		System.out.print("딸기 한 개당 가격: ");
		int strawPrice = sc.nextInt();

		int t1 = appleCount * applePrice;
		int t2 = strawCount * strawPrice;
		int t3 = t1 + t2;

		System.out.println("사과 구매 가격은 " + t1 + "원입니다.");
		System.out.println("딸기 구매 가격은 " + t2 + "원입니다.");
		System.out.println("전체 구매 가격은 " + t3 + "원입니다.");

	}

}
