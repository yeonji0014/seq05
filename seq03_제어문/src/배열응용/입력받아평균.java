package 배열응용;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		int[] n3 = new int[3];
		for (int i = 0; i < 3; i++) {
			String n = JOptionPane.showInputDialog("숫자입력");
			n3[i] = Integer.parseInt(n);
			// System.out.println(n2 + 100);
		}
		
		//String list = Arrays.toString(n3);
		//System.out.println(list);
		System.out.println(Arrays.toString(n3));
		
		int sum = 0;
		for (int x : n3) {
			sum = sum + x;
		}
		
//		for (int i = 0; i < n3.length; i++) {
//			sum = sum + n3[i];
//		}
		
		System.out.println((double)sum / n3.length);
	}

}
