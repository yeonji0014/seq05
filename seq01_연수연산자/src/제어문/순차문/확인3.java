package 제어문.순차문;

public class 확인3 {

	public static void main(String[] args) {

		int w1 = 1000;
		int w2 = 2;
		int m1 = 2000;
		int m2 = 3;
		
		int w3 = w1 * w2;
		int m3 = m1 * m2;
		int result = w3 + m3;
		
		System.out.println("생수값: " + w3);
		System.out.println("마스크값: " + m3);
		System.out.println("총 지불금액: " + result);
		
		int n1 = 75;
		int n2 = 50;
		
		int result2 = n1 + n2;
		double result3 = (n1 + n2) / 2.0;
		
		System.out.println(result2);
		System.out.println(result3);
	}

}
