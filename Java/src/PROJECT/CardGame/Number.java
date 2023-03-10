package PROJECT.CardGame;
class Number {

	public void q1() {

		int[] num1 = new int[8];

		num1[0] = 1;
		num1[1] = 3;
		num1[2] = 5;
		num1[3] = 7;
		num1[4] = 9;
		num1[5] = 11;
		num1[6] = 13;
		num1[7] = 15;

		// 카드 섞기
		int temp = 0;
		for (int i = 0; i < num1.length; i++) {
			int random = (int) (Math.random() * 8);

			temp = num1[0];
			System.out.println("temp :" + temp);
			num1[0] = num1[random];
			num1[random] = temp;

			System.out.println("num" + i + " [" + num1[i] + "] ");
		}

		// 카드 뽑기
		for (int i = 0; i < num1.length; i++) {
			System.out.print(" [" + num1[i] + "] ");
		}

	}

	public void q2() {

		int[] num1 = new int[9];

		num1[0] = 2;
		num1[1] = 3;
		num1[2] = 6;
		num1[3] = 7;
		num1[4] = 10;
		num1[5] = 11;
		num1[6] = 13;
		num1[7] = 14;
		num1[8] = 15;

		// 카드 섞기
		int temp = 0;
		for (int i = 0; i < num1.length; i++) {
			int random = (int) (Math.random() * 9);

			temp = num1[0];
			System.out.println("temp :" + temp);
			num1[0] = num1[random];
			num1[random] = temp;

			System.out.println("num" + i + " [" + num1[i] + "] ");
		}

		// 카드 뽑기
		for (int i = 0; i < num1.length; i++) {
			System.out.print(" [" + num1[i] + "] ");
		}

	}

	public void q3() {

		int[] num1 = new int[8];

		num1[0] = 4;
		num1[1] = 5;
		num1[2] = 6;
		num1[3] = 7;
		num1[4] = 12;
		num1[5] = 13;
		num1[6] = 14;
		num1[7] = 15;

		// 카드 섞기
		int temp = 0;
		for (int i = 0; i < num1.length; i++) {
			int random = (int) (Math.random() * 9);

			temp = num1[0];
			System.out.println("temp :" + temp);
			num1[0] = num1[random];
			num1[random] = temp;

			System.out.println("num" + i + " [" + num1[i] + "] ");
		}

		// 카드 뽑기
		for (int i = 0; i < num1.length; i++) {
			System.out.print(" [" + num1[i] + "] ");
		}

	}

	public void q4() {

		int[] num1 = new int[8];

		num1[0] = 8;
		num1[1] = 9;
		num1[2] = 10;
		num1[3] = 11;
		num1[4] = 12;
		num1[5] = 13;
		num1[6] = 14;
		num1[7] = 15;

		// 카드 섞기
		int temp = 0;
		for (int i = 0; i < num1.length; i++) {
			int random = (int) (Math.random() * 9);

			temp = num1[0];
			System.out.println("temp :" + temp);
			num1[0] = num1[random];
			num1[random] = temp;

			System.out.println("num" + i + " [" + num1[i] + "] ");
		}

		// 카드 뽑기
		for (int i = 0; i < num1.length; i++) {
			System.out.print(" [" + num1[i] + "] ");
		}

	}
}