package 메서드기본;

public class 내카페2 {

	public static void main(String[] args) {
		계산기2 cal2 = new 계산기2();
		
		int total = cal2.add(5,3);
		System.out.println(total);
		double total2 = cal2.add(5, 3.2);
		System.out.println(total2);
		double total3 = cal2.add(5.2,3.3);
		System.out.println(total3);
		int total4 = cal2.add("5",3);
		System.out.println(total4);
		
	}

}
