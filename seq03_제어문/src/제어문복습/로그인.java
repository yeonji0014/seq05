package 제어문복습;

import java.util.Scanner;

public class 로그인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디와 패스워드를 순서대로 입력해 주세요.");
		String id = sc.next(); //String		
		String pw = sc.next(); //String
		
		String result = "";
		if (id.equals("root") && pw.equals("1234")) {
			result = "로그인실패";
		}else {
			result = "로그인실패";
		}
		System.out.println(result);
	}

}
