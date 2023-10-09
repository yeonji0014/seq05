package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 토익문제 {

	public static void main(String[] args) {
		int[] 답안 = new int[990];
		int[] 내답 = new int[990];
		int score = 0;
		
		Random r = new Random();
		for (int i = 0; i < 내답.length; i++) {
			답안[i] = r.nextInt(4); //0~3
			내답[i] = r.nextInt(4);
			if (답안[i] == 내답[i]) {
				score++;
			}
		}
		System.out.println(Arrays.toString(답안));
		System.out.println(Arrays.toString(내답));
		System.out.println(score + "점");
		
		
	}

}
