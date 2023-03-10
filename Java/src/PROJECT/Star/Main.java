package PROJECT.Star;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean runCheck = true;
		
		do {
			
			System.out.println("[0]:좌표-  [1]:삼각형  [2]:1번 반대  [3]:역삼각형  [4]:3번 반대 ");
			System.out.println("[5]:사각형 [6]:사각형");
			System.out.println("[7]:피라미드 [8]:역피라미드");
			System.out.println("[9]:다이아몬드");
			System.out.print("선택 : ");
			int selectNum = new Scanner(System.in).nextInt();
			
			switch (selectNum) {
				case 0: {
					Stars.matrix();
					break;
				}
				case 1: {
					Stars.star01();
					break;
				}
				case 2: {
					Stars.star02();
					break;
				}
				case 3: {
					Stars.star03();
					break;
				}
				case 4: {
					Stars.star04();
					break;
				}
				case 5: {
					Stars.star05();
					break;
				}
				case 6: {
					Stars.star06();
					break;
				}
				case 7: {
					Stars.star07();
					break;
				}
				case 8: {
					Stars.star08();
					break;
				}
				case 9: {
					Stars.star09();
					break;
				}
				case 10: {
					Stars.star10();
					break;
				}
				
				case 99: {
					runCheck = false;
					break;
				}
			}// The end of switch
		} while (runCheck);
	}// The end of method
}
