package practice;

import javax.swing.JOptionPane;

public class 연습문제123 {

	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("숫자1 입력");
		String n2 = JOptionPane.showInputDialog("숫자2 입력");
		
		int n3 = Integer.parseInt(n1);
		int n4 = Integer.parseInt(n2);
		
		int r1 = n3 + n4;
		int r2 = n3 - n4;
		int r3 = n3 * n4;
		int r4 = n3 / n4;
		
		System.out.println("두 수의 합은 " + r1);
		System.out.println("두 수의 차는 " + r2);
		System.out.println("두 수의 곱은 " + r3);
		System.out.println("두 수를 나눈 값은 " + r4);
		
		String tem1 = JOptionPane.showInputDialog("현재 온도");
		double tem2 = Double.parseDouble(tem1);
		String result = "";
		if (tem2 >= 25.0) {
			result = "너무 더워요.";
		} else {
			result = "괜찮아요.";
		}
		System.out.println(result);
		
	}

}
