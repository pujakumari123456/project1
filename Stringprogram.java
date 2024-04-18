package com.demo.javasession;
import java.util.Arrays;
import java.util.Scanner;

public class Stringprogram {

	public static void main(String[] args) {
		//totalcountstring();
		//totalcountstring2();
		//punctuationchar();
		//vowelsandconsonants();
		//anagram();
		//stringnequalpart();
	}
	public static void totalcountstring() {
		String tc = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		tc =sc.nextLine();
		int count =0;
		for(int i=0;i<tc.length();i++) {
			if(tc.charAt(i)!=' ') 
				count++;
		}
		System.out.println("Total number of characters in a string: " + count);
		
	}
	public static void totalcountstring2() {
		String s = new String();
		String s2 =new String();
		Scanner cs =new Scanner(System.in);
		System.out.println("Enter 1st String");
		s=cs.nextLine();
		System.out.println("Enter 2nd String");
		s2 =cs.nextLine();
		int count =0;
		for(int i=0;i<s2.length();i++) {
			if(s2.charAt(i)!=' ')
				count++;
		}
		System.out.println("Total number of characters in a string2:  " + count);
		
	}
	public static void punctuationchar() {
		String p =new String();
		Scanner r =new Scanner(System.in);
		System.out.println("Enter the String");
		p =r.nextLine();
		int countpun =0;
		for(int i=0;i<p.length();i++) {
			if(p.charAt(i)== '!'||p.charAt(i) =='?'||p.charAt(i)==';'||p.charAt(i)=='.'||p.charAt(i)==',') {
				countpun++;
				
			}
		}
		System.out.println("Total number of punctuation charater exists in a String : " +countpun);
		
	}
	public static void vowelsandconsonants() {
		String a = new String();
		Scanner b =new Scanner(System.in);
		System.out.println("Enter the String");
		a=b.nextLine();
		int countvc =0,countcv=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='o'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='u') {
				countvc ++;
			}if(a.charAt(i)!='a'&& a.charAt(i)!='o'&& a.charAt(i)!='e'&& a.charAt(i)!='i'&& a.charAt(i)!='u') {
				countcv ++;
			}
		}
		System.out.println("count vowels : "+countvc);
		System.out.println("count consonants : "+countcv);
	}
	public static void anagram() {
		String s1 =new String();
		String s2 =new String();
		Scanner sa =new Scanner(System.in);
		System.out.println("enter the 1st String");
		s1=sa.nextLine();
		System.out.println("enter the 2nd String");
		s2=sa.nextLine();
		char c1[]=s1.toLowerCase().toCharArray();
		char c2[]=s2.toLowerCase().toCharArray();
		if(c1.length!=c2.length) {
			System.out.println("Not anagram");
			System.exit(0);
		}
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i=0; i< c1.length;i++) {
			if(c1[i]!=c2[i]) {
			System.out.println("not anagram");
			System.exit(0);
			
		}
		}System.out.println("anagram");

}
	public static void stringnequalpart() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the String :");
		 String n = scan.next();
		 int ln = n.length();
		 System.out.println("Enter the num :");
		 int num = scan.nextInt();
		 int n1 = ln/num;
		 String s;
		  if (ln%num==0) {
			  for(int i=0;i<num;i++) {
				  s="";
				  for(int j=i*n1;j<(i+1)*n1;j++){
					  s = s+n.charAt(j);
					  
				  }
				  System.out.println(s); 
			  }
			  }
		  else {
			  System.out.println("cant be divide");   
		  }
		
	}
}