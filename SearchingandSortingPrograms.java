package com.demo.javasession;

public class SearchingandSortingPrograms {

	public static void main(String[] args) {
		//linearsrchstring();
		//linearsrchint();
	//Binarysrch();
		//Bubblesort();
		//selectionsort();
		//insertionsort();
	}
	public static void linearsrchstring() {
		String[] arr= {"puja","raj","anu","sanwar"};
		String iteam="raj";
		int temp =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(iteam)) {
				System.out.println("iteam in present : "+i+ " index postion");
				temp =temp+1;
						
			}
			
		}
		if(temp==0) {
			System.out.println("item is not present");
		}
	}
	public static void linearsrchint() {
		int []arr = {1,2,6,8,4,3};
		 int num =8;
		 int tamp =0;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==num) {
			 System.out.println("iteam present in  :"+i+": index position");
			 tamp+=1;
		 }
		
	}if(tamp==0) {
		System.out.println("item is not present");
	}

}
	public static void Binarysrch() {
		int [] arr = {1,2,3,6,8,9,10,13,14,17,19,20,26,28,32}; // binary search applied only in sort list
		int srch =33;
		int li=0;
		int hi=arr.length-1;
		int mi=(li+hi)/2;
		while(li<=hi) {
			if(arr[mi]==srch) {
				System.out.println("iteam present at :"+mi+" index position");
				break;
			}else if(arr[mi]<srch) {
				li=mi+1;
			}else {
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}if(li>hi) {
			System.out.println("iteam not present");//sort list ony work.
		}
	}
	public static void Bubblesort() {
		int[] a = {12,19,21,9,34,1,8};
		int temp;
		for(int i=0;i<a.length;i++) {
			int flag =0;
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];//swaping element
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}if(flag==0) {
				break;
			}
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"  ");//to read the list
		}
		
	}
	public static void selectionsort() {
		int [] a= {10,19,6,3,24,8};
		int min;int temp=0;
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if (a[j]<a[min]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}}
     public static void insertionsort() {
    	 int [] a= {5,3,7,2,9,0,1};
    	 int temp,j;
    	 for(int i=1;i<a.length;i++) {
    		 temp=a[i];
    		 j=i;
    		 while(j>0 && a[j-1]>temp) {
    			 a[j]=a[j-1];
    				j=j-1;	 
    		 }
    		 a[j]=temp;
    	 }
    	 for(int i=1;i<a.length;i++) {
    		 System.out.print(a[i]+" ");
    	 }
}}