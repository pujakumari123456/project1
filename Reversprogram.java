package com.demo.javasession;

public class Reversprogram {

//	public static void main(String[] args) {
//		// Using StringBuffer class			
//		StringBuffer a = new StringBuffer("Software Testing Material");			
//		// use reverse() method to reverse string			
//		System.out.println(a.reverse());			}			
//		
//	}


//    public static void main(String[] args) {
//        String original = "Hello, World!";
//
//        // Using a StringBuilder to reverse the string
//        StringBuilder reversed = new StringBuilder(original);        reversed.reverse();
//        System.out.println("Original string: " + original);
//        System.out.println("Reversed string: " + reversed.toString());
//    }
//}
	 public static void main(String[] args) {
		 String a="puja";
		 String rev="";
		 for(int i=a.length()-1;i>=0;i--) {
			 rev =rev +a.charAt(i);
		 }
		 System.out.println(rev);
	 }
}