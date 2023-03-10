package PROJECT.GuGuDan;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		row();
		line();
	}
	
	public static void row() {
		for (int i = 2; i <= 9; i++) {
			System.out.println("== "+i+" 단 ==");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}
			System.out.println();
		}
	}// The end of method
	
	public static void line() {
		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 9; i++) {
				System.out.print(i + " X " + j + " = " + (i*j)+"\t");
			}
			System.out.println();
		}
		
	}// The end of method

}
