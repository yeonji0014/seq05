package 생성자;

public class 내카페4 {

	public static void main(String[] args) {
		Cal4 c1 = new Cal4();
		int coffee = c1.add(5, 2000);
		int milk = c1.add(2, 3000);
		System.out.println("커피: " + coffee + ", 밀크티: " + milk);
		
		int total = c1.add3(coffee, milk);
		int div = c1.add2(total, person);
		//사람수????
		
	}

}
