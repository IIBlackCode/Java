package Java1000;

import java.util.*;

//[����2] ������ �������� while���� ���θ� �ּ��� ������ �����ؼ� �ϼ��ϼ���.
class WordScrambleEx2 {
	public static void main(String[] args) {
		String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW" };
		Scanner scan = new Scanner(System.in);

		String answer = getAnswer(strArr);
		String question = getScrambledWord(answer);

		while (true) {
			System.out.println("Question :" + question);
			System.out.print("Your answer is :");

			// 1. ȭ���� ���� ������� �Է��� �޴´�.(ScannerŬ���� ���)
			// 2. ����ڰ� q �Ǵ� Q�� �Է��ϸ� ���α׷��� �����Ѵ�.
			// 3. ����ڰ� ������ ���⶧���� �ݺ��ϴٰ�
			// ����ڰ� ������ ���߸�, while���� ����������.
			
			String enter = scan.nextLine();
			String result = enter.toUpperCase();
			if (result.equals("Q")) {
				//System.out.println(answer);
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else if(answer.equals(result)) {
				System.out.println("�����Դϴ�.");
				break;
				
			}

		} // while

	} // main

	public static String getAnswer(String[] strArr) {
		int idx = (int) (Math.random() * strArr.length);
		return strArr[idx];
	}

	public static String getScrambledWord(String str) {
		char[] chArr = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			int idx = (int) (Math.random() * str.length());

			char tmp = chArr[i];
			chArr[i] = chArr[idx];
			chArr[idx] = tmp;
		}

		return new String(chArr);
	} // scramble(String str)
}
//[��ó] [Java1000��]Word Scramble 2 - �ܾ� ���߱�(1���� ����) (���ü��� �ڵ��ʺ����͵�(�ڹ� java, c���, javascript, python) |�ۼ��� ���ü�
