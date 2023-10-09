package 연산자;

import javax.swing.JOptionPane;

public class 기본데이터연산자확인문제1 {

	public static void main(String[] args) {

		char pw1 = 'p';
		String in1 = JOptionPane.showInputDialog("암호를 입력해 주세요.");
		char pw2 = in1.charAt(0);

		if (pw1 == pw2) {
			JOptionPane.showMessageDialog(null, "PASS!");
		} else {
			JOptionPane.showMessageDialog(null, "재입력!");
		}
		
		double change = 2.2;

		if (change > 2) {
			JOptionPane.showMessageDialog(null, "다이어트 성공!");
		}

		if (pw1 == pw2 && change > 2) {
			JOptionPane.showMessageDialog(null, "오늘은 성공!");
		} else {
			JOptionPane.showMessageDialog(null, "내일 다시 도전!");
		}
		
		int num1 = 66;
		int num2 = 77;
		int num3 = 88;
		int num4 = 99;
		
		int sum = num1 + num2 + num3 + num4;
		double avg = sum / 4.0; //n.0
		
		System.out.println(avg);
		
		final double PI = 3.14; //상수 (final), 변경불가
		double half = 2.2;
		double ans = PI * half * half;
		System.out.println("원의 면적 >> " + ans);
		System.out.printf("원의 면적 >> %.2f", ans);
		String ans2 = String.format("원의 면적 >> %.2f", ans);
		JOptionPane.showMessageDialog(null, ans2);
		
	}
}
