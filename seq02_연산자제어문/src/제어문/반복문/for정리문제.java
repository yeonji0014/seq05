package 제어문.반복문;

public class for정리문제 {

	public static void main(String[] args) {
		int sum = 0; 
		for (int i =33; i <= 222; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		int sum2 = 0;
		for (int i = 55; i <= 4500; i = i + 2) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		
		int sum3 = 0;
		for (int i = 0; i <= 6000; i = i + 5) {
			sum3 = sum3 + i;
		}
		System.out.println(sum3);
		
		int sum4 = 0;
		for (int i = 1; i <= 1000; i = i + 3) {
			sum4 = sum4 + i;
		}
		System.out.println(sum4);
	}

}
