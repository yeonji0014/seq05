package practice;

import java.util.Date;

public class 데이트연습문제 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		if (hour < 11) {
			System.out.println("굿모닝");
		} else if (hour < 15) {
			System.out.println("굿애프터눈");
		} else if (hour < 19) {
			System.out.println("굿이브닝");
		} else {
			System.out.println("굿나잇");
		}

	}

}
