package BAEKJOON;

import java.util.Scanner;
/*
 * (A+B)%C�� (A%C + B%C)%C �� ������?
 * (A��B)%C�� (A%C �� B%C)%C �� ������?
 * �� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 *  ù° �ٿ� A, B, C�� ������� �־�����. (2 �� A, B, C �� 10000)
 *  
 *  ù° �ٿ� (A+B)%C, ��° �ٿ� (A%C + B%C)%C, ��° �ٿ� (A��B)%C, ��° �ٿ� (A%C �� B%C)%C�� ����Ѵ�.
 */
public class Main_2558 {
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