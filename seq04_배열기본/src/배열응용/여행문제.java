package 배열응용;

import java.util.Scanner;

public class 여행문제 {

	public static void main(String[] args) {
		String[] last = new String[3];
		String[] year = new String[3];
		int count = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < year.length; i++) {
			System.out.print("작년에 가고 싶었던 곳");
			last[i] = sc.nextLine();
			System.out.print("올해에 가고 싶었던 곳");
			year[i] = sc.nextLine();
			if (last[i].equals(year[i])) {
				count++;
			}
		}
		System.out.println("우선순위 동일한 곳 수: " + count);
	}

}
