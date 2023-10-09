package 생성자복습;

import java.util.ArrayList;

public class Cal5 {

	public ArrayList getEven(int[] num) {
		//그중 선택하라고 하는데, 여러개를 모아야 함.
		//고정된 크기(5개) --> 배열 사용 
		//가변적 크기 --> 배열X ==> 컬렉션을 사용!!!
		ArrayList list = new ArrayList();
		for (int x : num) {
			if (x % 2 == 0) {
				list.add(x); //{2, 4, 6, 8, 10}
			}
		}
		return list;
	}
}