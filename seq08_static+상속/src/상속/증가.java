package 상속;

public class 증가 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
	}
	
}
