package 메서드기본;

public class 계산기2 {
	public int add(int x, int y) {
		return x + y;
	}
	
	public double add(int x, double y) {
		return x + y;
	}
	
	public double add(double x, double y) {
		return x + y;
	}
	
	public int add(String x, int y) {
		return Integer.parseInt(x) + y;
	}
}
