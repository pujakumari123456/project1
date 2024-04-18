package com.demo.javasession;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		//oroperator();
		//andoperator();
		//AndOrif();
		//AndOrwithUserinput();
	}
	public static void andoperator() {
		int a=40,b=20,c=30;
		if((a>b)&& (a>c)){
			a+=1;
			System.out.println(a);
			
		}else
			System.out.println("A is not greater");

	}
	

public static void oroperator() {
int a=40,b=20,c=60;
if((a>b)||(a>c)){
	a+=1;
	System.out.println(a);
	
}else
	System.out.println("A is not greater");

}
public static void notoperator() {
int a=40,b=20,c=60;
if(a!=b){
	a+=1;
	System.out.println(a);
	
}else {
	System.out.println("A is not greater");
}
}
public static void AndOrif()
{
	int age=55;
	if (age==55) {
		age+=2;
		System.out.println("a :"+age);
		}
	else if(age>55 && age<65) {
	     System.out.println("b");
	     }
   else if(age<55||age<70) {
		System.out.println("c");}
  else {
	System.out.println("d");
		       }
}

public static void AndOrwithUserinput()
{

	int age;
	Scanner s = new Scanner(System.in);
	System.out.print( "Enter Value of age :" );
	  age = s.nextInt();
	if (age==29) {
		System.out.println("puja");}
	else if(age>29 && age<35) {
		System.out.println("raj");
	} else if(age>36 || age<20)
	{
		System.out.println("sanwar");}
	else {
		System.out.println("anu");
	}
}
}

	

