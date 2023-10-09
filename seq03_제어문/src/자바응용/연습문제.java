package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 연습문제 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(700, 500);
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton b1 = new JButton();
		b1.setText("짬뽕");
		JButton b2 = new JButton();
		b2.setText("우동");
		JButton b3 = new JButton();
		b3.setText("짜장");

		JLabel l1 = new JLabel();
		l1.setText("개수 : 0개");
		JLabel l2 = new JLabel();
		l2.setText("이미지 들어가는 곳------");
		JLabel l3 = new JLabel();
		l3.setText("결제금액");

		Font font = new Font("맑은 굴림", 1, 30);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		b1.setBackground(Color.magenta);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.blue);
		l1.setForeground(Color.blue);
		l3.setForeground(Color.blue);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		f.add(l2);
		f.add(l3);

		f.setVisible(true);

	}

}
