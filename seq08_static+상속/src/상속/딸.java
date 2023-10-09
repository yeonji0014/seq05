package 상속;

public class 딸 {
	public String name;
	public String gender;
	public static int father = 10000;
	public static int count;

	public 딸(String name, String gender) {
		this.name = name;
		this.gender = gender;
//		father = father - (1000 * count++);
		count++;
	}
	
	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}

	public void tv보다() {
		System.out.println("tv를 재밌게 보다.");
	}

}
