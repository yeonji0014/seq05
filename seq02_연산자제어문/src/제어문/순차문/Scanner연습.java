package 제어문.순차문;

import java.util.Scanner;

public class Scanner연습 {

	public static void main(String[] args) {
		//200번 연습
		Scanner sc = new Scanner(System.in);
		//new로 자동완성하고 빨간 밑줄이 생기면
		//부품이 어디있는지 모르겠다라는 의미 
		//빨간 밑줄 생긴 단어에서 클릭후, 첫번째 import를 선택함. 
		System.out.print("이름 입력>> ");
		String name = sc.next();//String으로 입력한 값을 가지고 들어온다.
		System.out.println("당신의 이름은 " + name);
		
		System.out.println("나이 입력>> ");
		int age = sc.nextInt();
		System.out.println("당신의 내년 나이는 " + (age + 1));
		
		
		
	}

}