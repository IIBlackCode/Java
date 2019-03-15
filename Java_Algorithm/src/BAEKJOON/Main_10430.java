package BAEKJOON;

import java.util.Scanner;
/*
 * (A+B)%C는 (A%C + B%C)%C 와 같을까?
 * (A×B)%C는 (A%C × B%C)%C 와 같을까?
 * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
 * 
 *  첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
 *  
 *  첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.
 */
public class Main_10430 {
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c;
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		if (2<= a && a <= 10000 && 2 <= b && b <= 10000 && 2<= c && c <= 10000) {
			System.out.println((a+b)%c);
			System.out.println((a%c+b%c)%c);
			System.out.println((a*b)%c);
			System.out.println(a%c * b%c);
		}
	}
}