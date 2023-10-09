package 제어문복습;

import java.util.Date;

public class 하루인사 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		String result = "";
		if (hour < 11) {
			result = "굿모닝";
		} else if (hour < 15) {
			result = "굿애프터눈";
		} else if (hour < 19) {
			result = "굿이브닝";
		} else {
			result = "굿나잇";
		}
		System.out.println(result);
	}

}
