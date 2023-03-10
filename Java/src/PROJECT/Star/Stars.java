package PROJECT.Star;

public class Stars {
	public static void matrix() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("["+i+","+j+"]");
			}
			System.out.println();
		}
	}// The end of method
	
	public static void star01() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
//				System.out.print("["+i+","+j+"]");
				if (i>=j) {
					System.out.print("[ * ]");
				}else {
					System.out.print("[   ]");
				}
			}
			System.out.println();
		}
	}// The end of for
	
	public static void star02() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
//				System.out.print("["+i+","+j+"]");
				if (i+j >= 4) {
					System.out.print("[ * ]");
				}else {
					System.out.print("[   ]");
				}
			}
			System.out.println();
		}
	}// The end of for
	
	public static void star03() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
//				System.out.print("["+i+","+j+"]");
				if (i<=j) {
					System.out.print("[ * ]");
				}else {
					System.out.print("[   ]");
				}
			}
			System.out.println();
		}
	}// The end of for
	
	public static void star04() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
//				System.out.print("["+i+","+j+"]");
				if (i+j <= 4) {
					System.out.print("[ * ]");
				}else {
					System.out.print("[   ]");
				}
			}
			System.out.println();
		}
	}// The end of for
	
	public static void star05() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
//				System.out.print("["+i+","+j+"]");
				if (i==0 || i == 4 || j == 0 | j ==4) {
					System.out.print("[ * ]");
				}else {
					System.out.print("[   ]");
				}
			}
			System.out.println();
		}
	}// The end of for
	
	public static void star06() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
//				System.out.print("["+i+","+j+"]");
				if (!(i==0 || i == 4 || j == 0 | j == 4)) {
					System.out.print("[ * ]");
				}else {
					System.out.print("[   ]");
				}
			}
			System.out.println();
		}
	}// The end of for
	
	public static void star07() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
//				System.out.print("["+i+","+j+"]");
				if (i+j >= 4 && i>=j) {
					System.out.print("[ * ]");
				}else {
					System.out.print("[   ]");
				}
			}
			System.out.println();
		}
	}// The end of for
	
	public static void star08() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
//				System.out.print("["+i+","+j+"]");
				if (i<=j && i+j <= 4) {
					System.out.print("[ * ]");
				}else {
					System.out.print("[   ]");
				}
			}
			System.out.println();
		}
	}// The end of for

	public static void star09() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
//				System.out.print("["+i+","+j+"]");
				if ( (i+j>=2 && i+j<=6) && (i-j <=2 && i-j>=-2 )) {
					System.out.print("[ * ]");
				}else {
					System.out.print("[   ]");
				}
			}
			System.out.println();
		}
	}// The end of for
	
	public static void star10() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
//				System.out.print("["+i+","+j+"]");
				if ( !(i+j>=2 && i+j<=6) && (i-j <=2 && i-j>=-2 ) ) {
					System.out.print("[ * ]");
				}else {
					System.out.print("[   ]");
				}
			}
			System.out.println();
		}
	}// The end of for
}
