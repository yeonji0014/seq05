package 연산자;

import javax.swing.JOptionPane;

public class 비교연산자기본형 {

	public static void main(String[] args) {

		String id = "root";
		String pw = "1234";
		
		if (id.equals("root") && pw.equals("1234")) {
			JOptionPane.showMessageDialog(null, "로그인성공");
		} else {
			JOptionPane.showMessageDialog(null, "로그인실패");

		}
		
	}

}
