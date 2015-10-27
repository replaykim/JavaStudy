import java.util.Scanner;

public class chapter1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;

		System.out.print("두 수를 입력하세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		System.out.println("\n\n===== Reuslt =====");
		System.out.println("더하기 : " + (num1 + num2));
		System.out.println("빼 기 : " + (num1 - num2));
		System.out.println("곱하기 : " + (num1 * num2));
		System.out.println("나누기 : " + (double) (num1 / num2));
		System.out.println("나머지 : " + (num1 % num2));
	}
}
