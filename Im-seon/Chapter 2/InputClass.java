import java.util.Scanner;

public class InputClass {
	private Scanner scan;
	private int a, b;

	public InputClass() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
	}
	
	public void Inputclass() {
		System.out.println("첫번째 수를 입력하시오.");
		a = scan.nextInt();

		System.out.println("두번째 수를 입력하시오.");
		b = scan.nextInt();

	}

	public int getNumA() {

		return a;
	}

	public int getNumB() {

		return b;
	}
}
