package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		컴퓨터 com = new 컴퓨터(100, "삼성", 24);
		컴퓨터 com2 = new 컴퓨터(200, "엘지", 27);
		
		System.out.println(com);
		System.out.println(com2);
		
	}

}
