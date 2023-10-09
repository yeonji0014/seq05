package practice;

public class 정리문제345 {

	public static void main(String[] args) {
		int waterPrice = 1000;
		int watercount = 2;
		int maskPrice = 2000;
		int maskcount = 3;
		
		int r1 = waterPrice * watercount;
		int r2 = maskPrice * maskcount;
		int r3 = r1 + r2;
		System.out.println("생수값 금액은 " + r1 + "원");
		System.out.println("마스크값 금액은 " + r2 + "원");
		System.out.println("총 지불금액은 " + r3 + "원");
		
		int n1 = 75;
		int n2 = 50;
		int n3 = n1 + n2;
		double n4 = n3 / 2.0;
		System.out.println("총합: " + n3);
		System.out.println("평균: " + n4);
		
	}

}
