import java.util.Scanner;

public class InputClass {
	private Scanner scan;
	private int a, b;

	public InputClass() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
	}
	
	public void Inputclass() {
		System.out.println("ù��° ���� �Է��Ͻÿ�.");
		a = scan.nextInt();

		System.out.println("�ι�° ���� �Է��Ͻÿ�.");
		b = scan.nextInt();

	}

	public int getNumA() {

		return a;
	}

	public int getNumB() {

		return b;
	}
}
