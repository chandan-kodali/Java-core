package com.chandan;

public class ArmstrongNumber {

	public static void main(String[] args) {

		for(int i=1;i<5000;i++) {
		int n = i;
		int chk = n%10;
		int sum=0,temp = n;
		while(chk!=0) {
			sum += chk * chk *chk;
			temp /=10;
			chk = temp%10;
			
		}
		if(sum == n) {
			System.out.println(i);
		}
		}
	}

}
