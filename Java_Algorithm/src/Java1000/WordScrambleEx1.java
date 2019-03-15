package Java1000;

/*
  	[����1] ������ ������ �ϼ��Ͻÿ�.
  	getAnswer(String[] strArr)�� �迭strArr�� ������� �ϳ��� ���Ƿ� ��� ��ȯ�Ѵ�.(Math.random()���)
  	getScrambledWord(String str)�� �־��� ���ڿ� str�� �� ������ ������ �ڼ��� ����, ���ο� ���ڿ��� ��ȯ�Ѵ�. (Math.random()���)
  	
  	[������]

	Question:HEPO
	Answer:HOPE

	[����]Math.random()�� ����ϱ� ������ ���� �������� �ٸ� �� �ֽ��ϴ�.
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

	
	//1. ���ڿ��� �޴´�.
	//2. ���ڿ��� ���´�.
	//3. ���� ���ڿ� ����
	//4. ����
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
//[��ó] [Java1000��]Word Scramble 1 - �ܾ� ���߱� (���ü��� �ڵ��ʺ����͵�(�ڹ� java, c���, javascript, python) |�ۼ��� ���ü�
