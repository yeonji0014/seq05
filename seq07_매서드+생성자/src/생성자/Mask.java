package 생성자;

public class Mask {
	public String color;
	public int price;
	public int count;
	public Mask(String color, int price, int count) {
		this.color = color;
		this.price = price;
		this.count = count;
	}
	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", count=" + count + "]";
	}
	
}
