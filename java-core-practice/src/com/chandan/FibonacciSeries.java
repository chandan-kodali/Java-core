package com.chandan;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int input = sc.nextInt();
		int i = 1;
		int tot = 2;
		int temp = 1;
		System.out.print("1 1 ");
		do {
			
			System.out.print(tot + " ");
			temp = i;
			i = tot;
			tot = i + temp;
		} while (tot < input);

	}

}
