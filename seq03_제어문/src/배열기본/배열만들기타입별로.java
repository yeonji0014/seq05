package 배열기본;

public class 배열만들기타입별로 {

	public static void main(String[] args) {
		int[] age = { 200, 100, 50, 10 };
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i] + " ");
		}
		System.out.println();
		for (int x : age) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		double[] weight = {99.9,88.8,77.7,66.6};
		for (int i = 0; i < weight.length; i++) {
			System.out.print(weight[i] + " ");
		}
		System.out.println();
		for (double d : weight) {
			System.out.print(d + " ");
		}
		System.out.println();
		
		String[] name = {"김가가","김나나","김다다","김라라"};
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		for (String x : name) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		char[] gender = {'남','여','남','여'};
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();
		for (char c : gender) {
			System.out.print(c + " ");
		}
		System.out.println();
		boolean[] food = {true,false,true,true};
		//food배열의 size=4, length=4
		for (int i = 0; i < food.length; i++) {
			System.out.print(food[i] + " ");
		}
		System.out.println();
		for (boolean b : food) {
			System.out.print(b + " ");
		}

	}

}
