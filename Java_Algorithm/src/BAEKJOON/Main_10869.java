package BAEKJOON;

import java.util.Scanner;
/*
 * �� �ڿ��� A�� B�� �־�����. 
 * �̶�, A+B, A-B, A*B, A/B(��), 
 * A%B(������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 *  �� �ڿ��� A�� B�� �־�����. (1 �� A, B �� 10,000)
 *  
 *  ù° �ٿ� A+B, ��° �ٿ� A-B, ��° �ٿ� A*B, ��° �ٿ� A/B, �ټ�° �ٿ� A%B�� ����Ѵ�.
 */
public class Main_10869 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
}