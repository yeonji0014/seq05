package 메서드연습;

import java.io.File;

public class 생성된일기장개수 {

	public static void main(String[] args) {
		File dir = new File(".");
		String[] list = dir.list();
		int count = 0;
		for (String x : list) {
			if (x.contains(".txt")) {
				System.out.println(x);
				count++;
			}
		}
		System.out.println(count);
		
	}

}
