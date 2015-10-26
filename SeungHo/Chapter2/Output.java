package com.company;

/**
 * Created by HSH on 15. 10. 26..
 */
public class Output {


    private int firstNum, secondNum, sum, sub, multiple, etc;
    private float divide;

    public void printFirst(){
        System.out.println("사친연산 계산기! 두 수를 입력하세요.");
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }

    public void setMultiple(int multiple) {
        this.multiple = multiple;
    }

    public void setEtc(int etc) {
        this.etc = etc;
    }

    public void setDivide(float divide) {
        this.divide = divide;
    }

    public void print(){
        System.out.println("첫번째 수  : " + firstNum);
        System.out.println("두번째 수  : " + secondNum);
        System.out.println("합 : " + sum);
        System.out.println("차 : " + sub);
        System.out.println("곱 : " + multiple);
        System.out.println("나누기 : " + divide);
        System.out.println("나머지 : " + etc);

    }
}
