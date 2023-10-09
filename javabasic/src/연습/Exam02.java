package 연습;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tall = JOptionPane.showInputDialog("키를 입력하세요.");
		double tall2 = Double.parseDouble(tall);
		
		JOptionPane.showMessageDialog(null, (tall2 - 100) * 0.9);
				
	}

}
