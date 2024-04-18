package com.demo.javasession;

public class LearningConstructor {
	LearningConstructor(){
		System.out.println("i am constructor");
	}
	LearningConstructor(int i){
		System.out.println("i am parameterised constructor");
		
	}
	void m1() {
		System.out.println("i am method");
	}

	public static void main(String[] args) {
		LearningConstructor ls =new LearningConstructor();
		LearningConstructor k =new LearningConstructor(10);
		ls.m1();
		

	}

}
