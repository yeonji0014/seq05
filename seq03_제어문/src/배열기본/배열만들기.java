package 배열기본;

public class 배열만들기 {

	public static void main(String[] args) {
		int[] s = new int[5];
		int[] s2 = { 1, 2, 3, 4, 5 };

		s[0] = 100;
		s[2] = 200;
		s[s.length - 1] = 300;

		System.out.println("s의 개수: " + s.length);
		System.out.println("s2의 개수: " + s2.length);
		System.out.println(s[0]);
		System.out.println(s[2]);
		System.out.println(s[s.length - 1]);

		System.out.println(s[0] + s[2]);
		System.out.println(s[0] == s[2]);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		for (int x : s) {
			System.out.println(x);
		}

	}

}
