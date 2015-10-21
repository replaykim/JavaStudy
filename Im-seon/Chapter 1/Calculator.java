package test_564602316;

import java.util.Scanner;

public class Calculator {
	public static void main(String [] args){
		
		int c;
		int a = 0;
		int b = 0;
		System.out.println("입력 : ");
		Scanner scanner = new Scanner(System.in);
		c= scanner.nextInt();
		a = scanner.nextInt();
		b = scanner.nextInt();
		
	
		
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+a*b);
		//재주와 마찬가지로 나누기했을때 소수점 밑에는 생략됨
		//소수점 밑까지 뜨도록 수정하길
		System.out.println(a+"/"+b+"="+a/b);
		//그리고 나머지계산은 어디갔지?
		
		
		
		
		
	}

}
