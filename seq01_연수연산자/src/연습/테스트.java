package 연습;

import javax.swing.JOptionPane;

public class 테스트 {

	public static void main(String[] args) {
		String day = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String after = JOptionPane.showInputDialog("수업 끝나고 무엇을 하실 예정인가요?");
		
		String doing = "오늘 " + day + "에 수업후 나는 " + after + "할 예정";
		System.out.println(doing);
		
		int num1 = 30;
		int num2 = 40;
		
		System.out.println(num1 + num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
	}

}
