package practice;

import javax.swing.JOptionPane;

public class 순차문확인문제 {

	public static void main(String[] args) {
		//String w1 = JOptionPane.showInputDialog("몸무게 입력: ");
		//String h1 = JOptionPane.showInputDialog("신장 입력: ");
		String w1 = JOptionPane.showInputDialog("몸무게 입력");
		String h1 = JOptionPane.showInputDialog("신장 입력");
		
		//int w2 = Integer.parseInt(w1);
		//int h2 = Integer.parseInt(h1);
		double w2 = Double.parseDouble(w1);
		double h2 = Double.parseDouble(h1);
		
		//int bmi = w2 / (h2 * h2);
		double bmi = w2 / (h2 * h2);
		
		//JOptionPane.showMessageDialog(null, "bmi = " + bmi);
		System.out.println("bmi: " + bmi);
		
		//int p1 = 3000;
		double p1 = 3000.0;
		double p2 = 33.3;
		
		double result = p1 + p2;
		System.out.println("최종 포인트는 " + result);
		
	}

}
