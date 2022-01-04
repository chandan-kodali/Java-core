package com.chandan;

public class PrimeNumber {

	public static void main(String[] args) {
		for (int k = 3; k < 100; k++) {
			int n = k;
			boolean isPrime = true;
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.println(k);
			//else
				//System.out.println("It's not");

		}

	}

}
