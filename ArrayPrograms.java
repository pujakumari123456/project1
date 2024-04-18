package com.demo.javasession;
import java.util.Collections;
import java.util.ArrayList;
public class ArrayPrograms {

	public static void main(String[] args) {
		copyarr();

	}
	public static void copyarr() {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("orange");
		fruits.add("banana");
		fruits.add("grape");
		fruits.add("kiwi");
		fruits.add("chiku");
		fruits.add("mango");
		fruits.add("pear");
		//System.out.print(fruits+" ");
		ArrayList<String> fruits2 = new ArrayList<>();
        fruits2.addAll(fruits);
		System.out.print(fruits2+" ");
	}

}
