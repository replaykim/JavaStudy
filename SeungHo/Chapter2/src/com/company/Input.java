package com.company;

import java.util.Scanner;

/**
 * Created by HSH on 15. 10. 26..
 */
public class Input {

    private Scanner scan;
    private int firstNum, secondNum;

    public void inputData(){

        scan = new Scanner(System.in);
        firstNum = scan.nextInt();
        secondNum = scan.nextInt();
    }

    public int getSecondNum() {
        return secondNum;
    }

    public int getFirstNum() {
        return firstNum;
    }
}
