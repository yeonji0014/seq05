package 제어문.반복문;

import javax.swing.JOptionPane;

public class 숫자맞추기게임 {

	public static void main(String[] args) {
		int target = 88;
		
		while (true) {
			String data = JOptionPane.showInputDialog("숫자를 입력");
			int data2 = Integer.parseInt(data);
			if (target == data2) {
				System.out.println("정답입니다.");
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			} else {
				System.out.println("정답이 아닙니다.");
			if (target < data2) {
				System.out.println("정답보다 커요!");
			} else {
				System.out.println("정답보다 작아요!");
			}
			
			} 
		}
		
	}

}
