package com.chandan;

public class VarArgTest {

	public static void main(String[] args) {

		testMethod("hi");
		testMethod("hello","chandan","how are you?");
	}

	public static void testMethod(String ... a) {
		for(String s:a) {
			System.out.println(s);
		}
	}
	
	public static void testMethod(String s) {
		System.out.println("in 11:"+s);
	}
	
}
