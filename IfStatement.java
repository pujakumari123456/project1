package com.demo.javasession;

public class IfStatement {
	public static void main(String[] args) {
		
		//ifstatement();
		//Nestedifstatement();
		//ifelsestatement()
		//ifelseifstatement();
		//switchstatement();
	forloop();
	}
	
public static void ifstatement() {
	int a=20;
	int b=30;
	if(b>a) {
	System.out.println("ok ok");	
	}
}
public static void Nestedifstatement() {
	int a=70;
	int b=70;
	if (a<b) {
		System.out.println("hello world");
	    if (a==b){
	    	System.out.println("hii every one");
	     }
	}
			
}


public static void ifelsestatement() {
	int a=20;
	int b=30;
	if(b>a) {
	System.out.println("ok ok");
	}else {
		System.out.println("hii puja");
		
}
}
public static void ifelseifstatement() {
	int marks=76;
	char grade;
	
	 if (marks>=80) {
		 grade='A';
	 }else if (marks>=70) {
		 grade='B';
		 
	 }else if (marks>=60) {
		 grade='C';
		
	 }else if (marks>=50)
	 {
		 grade='D';
		
	 }else {
		 grade='F';
	 }
	 System.out.println("grade :"+grade);
}
public static void switchstatement() {
	 int a=100;
	 int b=50;
	 switch(a+b) {
	 case 100:System.out.println("hi");
	 break;
	 case 85 :System.out.println("hello");
	 break;
	 default: 
	 System.out.println("bye");
	 }
}

public static void forloop(){
 for(int i=1;i<=3;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(i+"  ");
}
 System.out.println("");
 }

}
}