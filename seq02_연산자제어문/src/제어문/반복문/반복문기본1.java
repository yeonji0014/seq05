package 제어문.반복문;

import java.util.Date;

public class 반복문기본1 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("@");
		}
		
		int start = 0;
		while (start < 10) {
			System.out.println("%");
			start++;
		}
		
		while (true) {
			
			System.out.println("내가 계속 돌아간다.");
			
		Date date = new Date();
		if (date.getMinutes() == 26) {
			System.out.println("EXIT");
			break;
		}
		}
	}

}
