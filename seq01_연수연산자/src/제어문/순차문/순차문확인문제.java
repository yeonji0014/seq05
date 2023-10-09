package 제어문.순차문;

import javax.swing.JOptionPane;

public class 순차문확인문제 {

	public static void main(String[] args) {

		String n1 = JOptionPane.showInputDialog("몸무게 입력");
		String n2 = JOptionPane.showInputDialog("신장 입력");
		
		double n3 = Double.parseDouble(n1);
		double n4 = Double.parseDouble(n2);
		
;		double n5 = n3 / (n4 * n4);

		System.out.println("bmi지수는 " + n5);
		
		double p1 = 3000.0;
		double p2 = 33.3;
		
		double p3 = p1 + p2;
		
		System.out.println("최종 포인트는 " + p3);
		
	}

}
