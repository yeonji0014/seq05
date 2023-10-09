package 제어문.반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 랜덤Test {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(99) + 1; 
		int total = 0;
		
		while (true) {
			String data = JOptionPane.showInputDialog("숫자를 입력");
			//데이터 타입이 동일해야 비교 가능하다.!
			int data2 = Integer.parseInt(data);
			//cpu가 ram에 들어있는 값을 가져다가 1을 증가시키고 다시 램에 넣습니다.
			//total = total + 1;
			total++;
			if (target == data2) {
				System.out.println("정답입니다.");
				System.out.println("게임을 종료합니다.");
				System.out.println("전체시도횟수>> " + total);
				System.exit(0);
			} else {
				System.out.println("정답이 아닙니다. ");
				//정답보다 높은지, 낮은지 힌트를 주세요.!
				if (target < data2) {
					System.out.println("정답보다 커요!");
				} else {
					System.out.println("정답보다 작아요!");
				}
			} 
		}
	}

}