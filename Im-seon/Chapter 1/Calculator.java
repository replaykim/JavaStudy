package test_564602316;

import java.util.Scanner;

public class Calculator {
	public static void main(String [] args){
		
		int c;
		int a = 0;
		int b = 0;
		//한글 깨지는거 보니 encoding안대있는듯 설정하세여
		System.out.println("ÀÔ·Â ¤¡");
		Scanner scanner = new Scanner(System.in);
		c= scanner.nextInt();
		a = scanner.nextInt();
		b = scanner.nextInt();
		
	
		
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+a*b);
		System.out.println(a+"/"+b+"="+a/b);
		
		
		
		
		
	}

}
