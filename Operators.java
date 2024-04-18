package com.demo.javasession;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		//addition();
		//additionWithUserInput();
		//subration();
		//prefix();
		//postfix();
		//postfix2();
	}

	
	public static void addition() {
		
		int a=10;
		int b=20;
		int res;
		res = a+b;
		
 System.out.println("resut is : +" +res);	
	}
	
	public static void additionWithUserInput() {
		
		Scanner s = new Scanner(System.in);
		System.out.print( "Enter Value of a :" );
		int a = s.nextInt();
		System.out.print( "Enter Value of b :" );
		int b = s.nextInt();
		int res = a+b;
		
 System.out.println("resut is : +" +res);	
	}
	
	public static void subration() {
		
		int a=10;
		int b=20;
		int res;
		res = a-b;
		
 System.out.println("resut is : " +res);	
	}

	public static void prefix() {
		
		int a=10;
		
	System.out.println("resut is : " + ++a);	
	System.out.println("resut is : " + a);
	}

	public static void postfix() {
		
		int a=10;
		
	System.out.println("resut is : " + a++);	
	System.out.println("resut is : " + a);
	
}
public static void postfix2() {
		int a=10;
		System.out.println(a++ + ++a + ++a + a++ - a++ + a++);
	
}
}