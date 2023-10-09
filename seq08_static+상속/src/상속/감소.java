package 상속;

public class 감소 extends Thread {
	@Override
	public void run() {
		for (int i = 1000; i > 0; i--) {
			System.out.println(i);
		}
	}
	
}
