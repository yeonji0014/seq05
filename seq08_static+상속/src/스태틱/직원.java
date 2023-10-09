package 스태틱;

public class 직원 {
	public String name;
	public int age;
	public String gender;
	public static int count;
	public static int sum;
	
	public 직원(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		count++;
		sum = sum + age;
	}
	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	public static int getAvg() {
		return sum / count;
	}
	
	
}
