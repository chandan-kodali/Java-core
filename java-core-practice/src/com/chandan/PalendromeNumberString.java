package com.chandan;

public class PalendromeNumberString {

	public static void main(String[] args) {

		int n = 123454321;
		int num= n;
		int r = 0;
		int result = 0;
		while (n > 0) {
			r = n % 10;
			n /= 10;
			result = (result * 10) + r;
		}
		System.out.println("reverse number : " + result);
		if(num == result) {
			System.out.println("given number is palendrome");
		}else System.out.println("given num is not a palendrome");
		
				
		String s = "chandan";
		System.out.println("reverse string :"+new StringBuilder(s).reverse());
		
	}

}
