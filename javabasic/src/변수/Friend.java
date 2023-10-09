package 변수;

public class Friend {
	public static void main(String[] args) {

		// 기본형은 소문자, 부품 이름은 무조건 대문자(그래서 클래스명도 대문자)

		String name = "홍길동";
		int age = 200;
		String place = "홍천";
		double muge = 88.8;
		char col = 'y';
		boolean pro = true;
		// 컨트롤+쉬프트+f=코드정리

		System.out.println("친구의 이름은 " + name + "이고 나이는 " + age + "세이다.");
		System.out.println(place + "에 살고 있고 몸무게는 " + muge + "킬로이다.");
		System.out.println("좋아하는 색은 " + col + "가 들어가는 색이고, 프로그래머 여부는 " + pro + "이다.");

	}

}
