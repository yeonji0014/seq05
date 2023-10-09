package 부품사용하기;

import 부품만들기.강아지;
import 부품만들기.전화기;

public class 내방만들기 {

	public static void main(String[] args) {
		전화기 phone = new 전화기();
		phone.카톡하다();
		phone.인터넷하다();
		
		강아지 puppy = new 강아지();
		puppy.꼬리흔들다();
		puppy.짖다();
		
	}

}
