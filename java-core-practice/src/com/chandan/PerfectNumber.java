package com.chandan;

public class PerfectNumber {

	public static void main(String[] args) {
for(int k=1;k<500;k++) {
		int n = k;
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum += i;
			}
		}
		if(sum==n)
			System.out.println(n);
		//else
			//System.out.println("it's not");
}
	}

}
