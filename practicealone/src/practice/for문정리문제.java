package practice;

public class for문정리문제 {

	public static void main(String[] args) {
		// for (int i = 33; i <= 222; i++) {
		// System.out.println(i);
		// }
		int sum = 0;
		for (int i = 33; i <= 222; i++) {
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

		// 더한 값이 100이 넘으면 더하기를 종료
		// 5의 배수는 더하지 않습니다.
		int sum4 = 0;
		for (int i = 1; i <= 1000; i = i + 3) {
			if (i % 5 != 0) {
				sum4 = sum4 + i;
				if (sum4 > 100) {
					System.out.println(sum4);
					System.exit(0);
				}
			}
		}
	}
}