package com.demo.javasession;

public class Forloop {

	public static void main(String[] args) {
//		forloop1();
//		forloop2();
//		forloop3();
//		forloop4();
//		 forloop5();
//		forloop6();
//		forloop7();    //assignment"44444"
//	forloop8();    //assignment"4321"
//		forloop9();     //assignment"*"
//		forloop10();     //assignment"****"
//		forloop11();      //"4567"
//		forloop12();      //"square pattern"
//		forloop13();         //"hallow square"	
		forloop14();
	}	
		
	
public static void forloop1() {
	int i,j;
	for( i=1;i<=3;i++) {
		 for( j=1;j<=i;j++) {
			System.out.print(j+"   ");
		}
	 System.out.println("");
	}
}
public static void forloop2() {
	
	for(int i=1;i<=3;i++) {
		for(int j=1;j<=i;j++) {
		System.out.print(j+" ");
	}
	 System.out.println(" ");
	
}

}
public static void forloop3() {
for(int i=1;i<=4;i++) {
	for(int j=1;j<=i;j++) {
	System.out.print(j+" ");
		}
		System.out.println("");
	}
	}
public static void forloop4() {
	for(int i=1;i<=3;i++) {
		for(int j=1;j<=(4-i);j++) {
			System.out.print(j);
		}
		System.out.println(" ");
	}
}public static void forloop5() {
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=i;j++) {
		System.out.print(j+" ");
			}
			System.out.println("");
		}
	for(int i=1;i<=3;i++) {
		for(int j=1;j<=(4-i);j++) {
			System.out.print(j+" ");
		}
		System.out.println(" ");
		}


}
public static void forloop6() {
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=(5-i);j++) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
	}
}
public static void forloop7() {      
	for(int i=4;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print(i+" ");
		}
		System.out.println(" ");

}

}

public static void forloop8() {
	for(int i=4;i>=1;i--) {
		
		for(int j=i;j>=1;j--) {
			System.out.print(j+" ");
		}
		System.out.println("");
	}
}
public static void forloop9() {
	for(int i=1;i<=4;i++) {
		for(int b=1;b<=(4-i);b++) {
			System.out.print(" ");
		}for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println(" ");
		
	}
}
public static void forloop10() {
	for(int i=4;i>=1;i--) {
		for(int b=1;b<=(4-i);b++) {
			System.out.print(" ");
		}for(int j=1;j<=i;j++) {
		System.out.print("* ");
		}
		System.out.println(" ");
	}
}
public static void forloop11() {      
	for(int i=4;i>=1;i--) {
		for(int j=4;j<=i+3;j++) {
			System.out.print(j+" ");
		}
		System.out.println(" ");

}

}
public static void forloop12() {
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=4;j++) {
			System.out.print("* ");
		}
		System.out.println(" ");
	}
}
public static void forloop13() {
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=4;j++) {
			if(i==1||j==1||i==4||j==4)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println("  ");
	}
}
public static void forloop14() {
	int i,j ,k=1;
	for( i=1;i<=5;i++) {
		 for( j=1;j<i+1;j++) {
			System.out.print(k++ +"   ");
		}
	 System.out.println("");
	}
}

}
	


