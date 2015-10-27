package com.company;

import java.awt.*;
import java.util.Scanner;

/*
* Main메소드만 쓸경우 대부분 변수 Main안에서 선언을함 static이 뭐랄까
* 정적변수가 되서 모든 메소드가 공유할 수 있게됨 그래서 잘 안쓰게됨
* 하지만 지금은 객체지향이아니라 알아두기만 하길 바람
*/

public class Main {
    private static int number1,number2;
    private static  int plus,minus,times,remainder;
    private  static  double divided;

    public static void main(String[] args) {
        //Scanner도 전역변수면 좋을꺼 같음.
        Scanner sc = new Scanner(System.in);

        number1 = sc.nextInt();
        number2 = sc.nextInt();

        plus = number1 + number2;
        minus = number1 - number2;
        times = number1 * number2;
        divided =(double)number1/number2;
        remainder = number1%number2;

        System.out.println("두수의 합 =" + plus);
        System.out.println("두수의 차 =" + minus);
        System.out.println("두수의 곱 =" + times);
        System.out.println("두수의 나눔 =" + divided);
        System.out.println("두수의 나머지 =" + remainder);

    }


}
