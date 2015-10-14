import java.util.Scanner;

/**
 * Created by RYU on 2015-10-10.
 */
public class practice {
    public  static  void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("두수를 입력하시오!");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("두수의합="+(a+b));
        System.out.println("두수의뺄셈="+(a-b));
        System.out.println("두수의곱="+(a*b));
        System.out.println("두수의나눗셈="+(a/b));
        System.out.println("두수를 나눈후 나머지="+(a%b));


    }
}