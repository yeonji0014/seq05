package 제어문.순차문;

import javax.swing.JOptionPane;

public class 확인2 {

	public static void main(String[] args) {

		String n1 = JOptionPane.showInputDialog("첫번째 수");
		String n2 = JOptionPane.showInputDialog("두번째 수");
		
		int n3 = Integer.parseInt(n1);
		int n4 = Integer.parseInt(n2);
		
		int t1 = n3 + n4;
		int t2 = n3 - n4;
		int t3 = n3 * n4;
		int t4 = n3 / n4;
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		
		String tem = JOptionPane.showInputDialog("현재 온도는?");
		double result = Double.parseDouble(tem);
		if (result > 25) {
			JOptionPane.showMessageDialog(null, "너무 더워요.");
		} else {
			JOptionPane.showMessageDialog(null, "괜찮아요.");

		}
		
		int c1 = 5;
		int c2 = 5000;
		
		int c3 = c1 * c2;
		JOptionPane.showMessageDialog(null, "총 커피값: " + c3);
		if (c3 > 20000) {
			System.out.println("할인해드릴게요.");
		} else {
			System.out.println("총 커피값을 내세요.");
		}
		
		int age = 100; 
		int age2 = age + 1;
		JOptionPane.showMessageDialog(null, "내 내년나이: " + age2);
		if (age2 > 100) {
			JOptionPane.showMessageDialog(null, "이제부터 시작");
		} else {
			JOptionPane.showMessageDialog(null, "아직 젊어요");

		}
		
	}

}
