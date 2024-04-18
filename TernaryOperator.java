package com.demo.javasession;

public class TernaryOperator {

	public static void main(String[] args) {
		//Ternary();
		reternary();

}
 
public static void Ternary() {
	int num1=10;
	int num2=20;
	int res;
	if(num1>num2) {
		res=num1+num2;
	System.out.println("soooooo");}
	else{
		res=num1-num2;
		System.out.println("hahahahahah");
	}
}

public static void reternary()
{
	int num1=20;
	int num2=10;
	int res;
	res=(num1>num2)?(num1+num2):(num1-num2);
	System.out.println("res :"+res);
}
}