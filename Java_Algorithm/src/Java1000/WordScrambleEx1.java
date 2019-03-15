package Java1000;

/*
  	[문제1] 다음의 예제를 완성하시오.
  	getAnswer(String[] strArr)는 배열strArr의 요소중의 하나를 임의로 골라서 반환한다.(Math.random()사용)
  	getScrambledWord(String str)는 주어진 문자열 str의 각 문자의 순서를 뒤섞은 다음, 새로운 문자열로 반환한다. (Math.random()사용)
  	
  	[실행결과]

	Question:HEPO
	Answer:HOPE

	[참고]Math.random()을 사용하기 때문에 위의 실행결과와 다를 수 있습니다.
 */
class WordScrambleEx1 {
	public static void main(String[] args) {
		String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW" };

		String answer = getAnswer(strArr);
		String question = getScrambledWord(answer);

		System.out.println("Question:" + question);
		System.out.println("Answer:" + answer);
	} // main
		
	public static String getAnswer(String[] strArr) {
		int index = (int) (Math.random()*strArr.length);
		return strArr[index];
	}//End of getAnswer Method

	
	//1. 문자열을 받는다.
	//2. 문자열을 섞는다.
	//3. 섞은 문자열 조립
	//4. 리턴
	public static String getScrambledWord(String str) {
		String strSum="";
		int index = (int)(Math.random() * (str.length()));
//		char[] arr = new char[str.length()];
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) {
			
			char temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
			
		}
		for (int j = 0; j < arr.length; j++) {
			strSum += arr[j];
		}
		return strSum;
	}//End of getScrambledWord Method
}//End of WordScrambleEx1 class
//[출처] [Java1000제]Word Scramble 1 - 단어 맞추기 (남궁성의 코드초보스터디(자바 java, c언어, javascript, python) |작성자 남궁성
