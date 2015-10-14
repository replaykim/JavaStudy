package chappi12_1014;

import java.util.Scanner;

public class Chapter1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력해주세요.:");
        int Input = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("또 다른 정수를 입력해주세요.:");
        int Input2 = sc2.nextInt();

        int Plus = Input + Input2;
        int Minus = Input - Input2;
        int Multiplex = Input * Input2;
        double Divide = (double)Input / Input2;
        int Remain = Input % Input2;


        System.out.println("더하기 : " + Input + "+" + Input2 + "=" + Plus);
        System.out.println("빼기 : " + Input + "-" + Input2 + "=" + Minus);
        System.out.println("곱하기 : " + Input + "*" + Input2 + "=" + Multiplex);
        System.out.println("나누기 : " + Input + "/" + Input2 + "=" + Divide);
        System.out.println("나머지 : " + Input + "%" + Input2 + "=" + Remain);
    }
}
