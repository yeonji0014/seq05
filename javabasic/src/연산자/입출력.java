package 연산자;

import javax.swing.JOptionPane;

public class 입출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");
		JOptionPane.showMessageDialog(null, "당신의 이름은 " + name + "이군요.");
		System.out.println("당신의 이름은 " + name + "이군요.");
		
		String hobby = JOptionPane.showInputDialog("당신의 취미는 무엇인가요?");
		JOptionPane.showMessageDialog(null, name + "님의 취미는 " + hobby + "입니다.");
		System.out.println(name + "님의 취미는 " + hobby + "입니다.");
		
		String time = JOptionPane.showInputDialog("당신은 몇시에 일어나나요?");
		JOptionPane.showMessageDialog(null, hobby + "는 " + time + "시에 시작할 수 있군요!");
		System.out.println(hobby + "는 " + time + "시에 시작할 수 있군요!");
		
		int time2 = Integer.parseInt(time);
		int result = time2 + 1;
		System.out.println(hobby + "는 " + result + "에 시작하자.");
		
	}

}
