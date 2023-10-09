package 매서드활용;

import java.util.ArrayList;

public class Cal5 {
	public ArrayList<Integer> getEven(int[] num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer x : num) {
			if (x % 2 == 0) {
				list.add(x);
			}
		}
		return list;
	}
}
