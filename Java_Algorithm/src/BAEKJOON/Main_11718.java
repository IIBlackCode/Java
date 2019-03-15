package BAEKJOON;

import java.util.Scanner;
/*
 * �Է��� �־�����. �Է��� �ִ� 100�ٷ� �̷���� �ְ�, 
 * ���ĺ� �ҹ���, �빮��, ����, ���ڷθ� �̷���� �ִ�. 
 * �� ���� 100���ڸ� ���� ������, 
 * �� ���� �־����� �ʴ´�. ��, �� ���� �������� �������� �ʰ�, �������� ������ �ʴ´�
 */
public class Main_11718 {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		//hasNextLine() : ���� �ٿ� �Է��� �ִ��� ���θ� �Ǵ��� BooleanŸ������ ��ȯ�ϴ� �޼ҵ�
		while (scan.hasNextLine()) {
			
			//text�� �Էµ� ���ڿ� ����
			String text = scan.nextLine();
			
			//�Էµ� ���ڿ� ���̰� 100 ���ϰ� �� ������ ������ ���
			if (text.length() <= 100 || !(text.isEmpty())) {
				System.out.println(text);
			}
		}
		scan.close();
	}
}