package 연산자;

public class 논리연산비교연산확인문제 {

	public static void main(String[] args) {

		int hot = 25;
		int wind = 100;
		
		if(hot >= 30 || wind < 88) {
			System.out.println("양산을 들고감.");
		}else {
			System.out.println("양산을 안들고감.");
		}
	}

}
