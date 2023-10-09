package 제어문.순차문;


import java.awt.FlowLayout;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class 벽돌부품만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setVisible(true);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JFrame f2 = new JFrame();

		Date date1 = new Date();
		
		Random r = new Random();
		JButton b = new JButton();
		b.setText("나의 정보 확인");
		
		f.add(b);
		
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();
		f.add(t1);
		f.add(t2);
		f.add(t3);
		
	}

}
