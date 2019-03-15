package BAEKJOON;

import java.util.Scanner;
/*
 * 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 
 * 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 
 * 각 줄은 100글자를 넘지 않으며, 
 * 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다
 */
public class Main_11718 {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		//hasNextLine() : 다음 줄에 입력이 있는지 여부를 판단해 Boolean타입으로 반환하는 메소드
		while (scan.hasNextLine()) {
			
			//text에 입력된 문자열 저장
			String text = scan.nextLine();
			
			//입력된 문자열 길이가 100 이하고 빈 공간이 없을때 출력
			if (text.length() <= 100 || !(text.isEmpty())) {
				System.out.println(text);
			}
		}
		scan.close();
	}
}