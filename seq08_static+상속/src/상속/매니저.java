package 상속;

public class 매니저 extends 직원{
	public 매니저(String name, String address, int salary, int rrn) {
		super(name, address, salary, rrn);
		// TODO Auto-generated constructor stub
	}

	int bonus;
	
	public void test() {
		System.out.println(bonus);
	}
	
	
	
}
