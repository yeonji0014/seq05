package 연습;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String garo = JOptionPane.showInputDialog("가로 길이를 입력해 주세요.");
		String sero = JOptionPane.showInputDialog("세로 길이를 입력해 주세요.");
		
		int garo2 = Integer.parseInt(garo);
		int sero2 = Integer.parseInt(sero);
		int square = garo2 * sero2;
		
		JOptionPane.showMessageDialog(null, "사각형의 면적은 " + square + "입니다.");
		System.out.println(square);				
		
		
	}

}
