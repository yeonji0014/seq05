package 배열응용;

import java.util.Arrays;

public class 여러개배열사용 {

	public static void main(String[] args) {
		String[] 식구 = { "아버지", "어머니", "형", "나", "동생" };
		int[] 나이 = { 100, 99, 88, 77, 55 };
		double[] 키 = { 199.9, 189.9, 179.9, 169.9, 159.9 };
		
		System.out.println("=====================");
		System.out.println("====== 우리 가족 =======");
		System.out.println("=====================");
		
		for (int i = 0; i < 식구.length; i++) {
			System.out.println(식구[i] + "\t" + 나이[i] + "\t" + 키[i]);
		}
		
		for (int i = 0; i < 키.length; i++) {
			//나이[i] = 나이[i] + 1;
			나이[i]++;
		}
		
		키[4] = 키[4] + 5;
		
		System.out.println(Arrays.toString(나이));
		
	}

}
