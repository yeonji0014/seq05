package 배열기본;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		int[] s = new int[5];
		System.out.println(s.length);
		s[0] = 100;
		System.out.println(s[0]);
		s[s.length - 1] = 500;
		System.out.println(s[s.length - 1]);
		s[2] = 200;
		System.out.println(s[2]);
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
		//인덱스
		for (int i = 0; i < s.length; i++) {
			System.out.println(i + ": " + s[i]);
		}
		
		
	}

}
