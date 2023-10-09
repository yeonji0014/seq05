package 제어문.조건문;

import java.util.Date;

public class 데이트확인문제 {

	public static void main(String[] args) {
		Date date = new Date();
		int year = date.getYear() + 1900;

		String result = "밀레니엄 세대가 아니시군요.";
		if (year >= 2000) {
			result = "밀레니엄 세대시군요.";
		}

		System.out.println(result);
		System.out.println("-----------------");
		
		int day = date.getDay();
		switch (day) {
		case 0:
		case 6:
			System.out.println("주말이라 쉬자~~~!");
			break;
		default:
			System.out.println("열심히 공부하자~~~!");
			break;
		}
		System.out.println("-----------------");
		
		int month = date.getMonth() + 1;
		switch (month) {
		case 2:
			System.out.println("28일까지");
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지");
			break;
		default:
			System.out.println("30일까지");
			break;
		}
	}

}
