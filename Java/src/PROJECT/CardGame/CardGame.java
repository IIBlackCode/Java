package PROJECT.CardGame;
import java.util.Scanner;

public class CardGame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Number card = new Number();
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		
		System.out.println("게임을 시작하시겠습니까?[y]");
		String input0 = scan.nextLine();
		if (input0.equals("y")) {
			System.out.println("1~15중 숫자 하나를 선택하시오");
			
			card.q1();
			System.out.println("이중에 숫자가 있나요[y/n]");
			String input1 = scan.nextLine();
			if (input1.equals("y")) {
				sum = 1;
			}
			
			card.q2();
			System.out.println("이중에 숫자가 있나요[y/n]");
			
			String input2 = scan.nextLine();
			if (input2.equals("y")) {
				sum = sum + 2;
			}
			
			card.q3();
			System.out.println("이중에 숫자가 있나요[y/n]");
			String input3 = scan.nextLine();
			if (input3.equals("y")) {
				sum = sum + 4;
			}
			
			card.q4();
			System.out.println("이중에 숫자가 있나요[y/n]");
			String input4 = scan.nextLine();
			if (input4.equals("y")) {
				sum = sum + 8;
			}
			
		}else {
			System.out.println("Game Over");
		}
		
		
		
		System.out.println("당신이 선택한 숫자는 "+sum + "입니다");
	}
}