package practice;

public class 정리문제12 {

	public static void main(String[] args) {
		int coffeeCount = 5;
		int coffeePrice = 5000;
		int total = coffeeCount * coffeePrice;
		if (total > 20000) {
			System.out.println("할인해드릴게요.");
		} else {
			System.out.println("총 커피값을 내세요");
		}
		
		int age = 100;
		int age2 = age + 1;
		System.out.println("내 내년 나이는 " + age2 + "세");
		
		if (age2 > 100) {
			System.out.println("이제부터 시작");
		} else {
			System.out.println("아직 젊어요");
		}
		
		
	}

}
