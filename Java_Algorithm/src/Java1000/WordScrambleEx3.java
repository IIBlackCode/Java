package Java1000;

import java.util.*;

//[문제3] 문제2의 예제를 변경해서, 문제를 맞추더라도 프로그램이 종료되지 않고 다음문제를 보여주도록 하세요.
class WordScrambleEx3 {
	public static void main(String[] args) {
		String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW" };
		Scanner scan = new Scanner(System.in);


		String result = "";
		// 코드를 넣어 완성하세요.
		// hint : while문을 중첩해서(2개의 while문) 작성하세요.
		
		// 1. 화면을 통해 사용자의 입력을 받는다.(Scanner클래스 사용)
		// 2. 사용자가 q 또는 Q를 입력하면 프로그램을 종료한다.
		// 3. 사용자가 정답을 맞출때까지 반복하다가
		// 사용자가 정답을 맞추면, while문을 빠져나간다.
		
		while (true) {
			String answer = getAnswer(strArr);
			String question = getScrambledWord(answer);
			
			while(true) {
				System.out.println("Question :" + question);
				System.out.print("Your answer is :");
				String enter = scan.nextLine();
				result = enter.toUpperCase();
				
				if (result.equals("Q")) {
					//System.out.println(answer);
					System.out.println("프로그램을 종료합니다.");
					//break;
					System.exit(0);
				}else if(answer.equals(result)) {
					System.out.println("정답입니다.");
					break;
					/* continue; -- 문제가 바뀌지 않는다.
					 * 반복문을 벗어나지 않는다. 
					 * inner while문 내에서만 재실행된다.
					 */
				}else {
					System.out.println(enter+"은/는 정답이 아닙니다. 다시 시도해보세요.");
					
				}
				
			}//end of inner while
			
		} //end of outer while

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
//[출처] [Java1000제]Word Scramble 3 - 단어 맞추기 (남궁성의 코드초보스터디(자바 java, c언어, javascript, python) |작성자 남궁성