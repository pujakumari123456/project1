package com.demo.javasession;

public class Learningmethod {
	void m1() {
		System.out.println("i am method");
	}
	void m2() {
		System.out.println("i am method2");
	}
	int m3() {
		System.out.println("i am int");
		return 10;
	}
	void m4(int i) {
		System.out.print("i am parameterise method"); //method overloading
		
	}
	void m4() {
		System.out.println("i am parameter with zero value");
	}
	void m4(int i,String k) {
		System.out.println("i am method with two parameter......int i and string k ");
	}
	void m4(String i,int j) {
		System.out.println("i am method with two parameter......string k and int i");	
	}
	void m4(String j,String k) {
		System.out.println("i am method with same datatype with two different parameter");
		
	}
// object need to create inside the method 
	public static void main(String[] args) {
		Learningmethod lm= new Learningmethod();//Creating a object
		lm.m2(); // calling object
		lm.m1();
		int i=lm.m3();
		System.out.println("I value is : " +i);
		lm.m4(30);
		lm.m4();
		lm.m4(10,"java");
		lm.m4("puja",32);
		lm.m4("raj","trivedi");

	}

}
