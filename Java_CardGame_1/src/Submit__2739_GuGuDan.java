import java.util.Scanner;

public class Submit__2739_GuGuDan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for (int i = 1; i < 10; i++) {
			if (n >= 1 && n <= 9) {
				System.out.println(n+" X "+ i +" = "+(n*i));
			}
		}
		
	}

}
