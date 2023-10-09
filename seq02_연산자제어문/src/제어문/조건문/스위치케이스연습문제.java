package 제어문.조건문;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 스위치케이스연습문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("먹고 싶은 입력>> ");
		String name = sc.next();
		
		switch (name) {
		case "짜장면":
			System.out.println("중국집으로 가요");
			break;
		case "라면":
			System.out.println("분식집으로 가요");
			break;
		case "회":
			System.out.println("횟집으로 가요");
			break;
		default:
			System.out.println("그냥 안먹어요");
			break;
		}
	}

}
