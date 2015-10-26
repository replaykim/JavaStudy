package com.company;

import java.awt.*;
import java.util.Scanner;


public class Main {

    private static int number1,number2;
    private static  int plus,minus,times,remainder;
    private  static  double divided;

    public static void main(String[] args) {

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
