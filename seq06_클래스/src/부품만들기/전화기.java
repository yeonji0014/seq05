package 부품만들기;

public class 전화기 {
	public int size;
	public String speaker;
	
	public void 인터넷하다() {
		System.out.println("크롬으로 인터넷하다");
	}

	@Override
	public String toString() {
		return "전화기 [size=" + size + ", speaker=" + speaker + "]";
	}
	
}
