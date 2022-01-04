package com.chandan;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int i= 20,j=30;
		
		i += j;
		j = i -j;
		i -= j;
		System.out.println(i);
		System.out.println(j);
		
	}

}
