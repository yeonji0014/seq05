package 상속;

public class Car extends Thread{
	String color;
	
	public void run() {
		System.out.println(color);
	}
}
