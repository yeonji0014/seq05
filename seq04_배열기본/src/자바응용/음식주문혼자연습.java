package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 음식주문혼자연습 {
	static int total = 0;
	static int total1 = 0;
	static int total2 = 0;
	static int total3 = 0;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(700, 700);
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
		l1.setText("개수: 0개");
		JLabel l2 = new JLabel();
		ImageIcon icon = new ImageIcon("aaa.png");
		l2.setIcon(icon);
		JLabel l5 = new JLabel();
		l5.setText("짬뽕: 5000원 우동: 6000원 짜장: 7000원");
		JLabel l3 = new JLabel();
		l3.setText("짬뽕: 0개, 우동: 0개, 짜장: 0개");
		JLabel l4 = new JLabel();
		l4.setText("주문금액: 0원입니다.");

		Font font = new Font("바탕", 1, 30);

		b1.setBackground(Color.pink);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.blue);

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		l1.setFont(font);
		l5.setFont(font);
		l3.setFont(font);
		l4.setFont(font);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		f.add(l2);
		f.add(l5);
		f.add(l3);
		f.add(l4);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("짬뽕선택함");
				total++;
				total1++;
				l1.setText("개수: " + total + "개");
				l3.setText("짬뽕: " + total1 + "개, 우동" + total2 + "개, 짜장" + total3 + "개");
				l4.setText("주문금액: " + (total1 * 5000 + total2 * 6000 + total3 * 7000) + "원입니다.");
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("우동선택함");
				total++;
				total2++;
				l1.setText("개수: " + total + "개");
				l3.setText("짬뽕: " + total1 + "개, 우동" + total2 + "개, 짜장" + total3 + "개");
				l4.setText("주문금액: " + (total1 * 5000 + total2 * 6000 + total3 * 7000) + "원입니다.");
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("짜장선택함");
				total++;
				total3++;
				l1.setText("개수: " + total + "개");
				l3.setText("짬뽕: " + total1 + "개, 우동" + total2 + "개, 짜장" + total3 + "개");
				l4.setText("주문금액: " + (total1 * 5000 + total2 * 6000 + total3 * 7000) + "원입니다.");
			}
		});

		f.setVisible(true);
	}

}
