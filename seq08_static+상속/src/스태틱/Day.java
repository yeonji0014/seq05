package 스태틱;

public class Day {
	public String doing;
	public int time;
	public String location;
	public static int count;
	public static int sum;
	
	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		sum = sum + time;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}

}
