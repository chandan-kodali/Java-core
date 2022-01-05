package com.chandan;

import java.util.Random;

public class ArrayaBasic {

	public static void main(String[] args) {

		Random r = new Random();
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(50);
		}

		for (int j : a) {
			//System.out.println(j);
		}
		
		
		int b[][] = new int[5][5];
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				b[i][j] = r.nextInt(9);
			}
			
		}
		
		for (int j[] : b) {
			for(int k: j) {
				System.out.print(" "+k);
			}
			System.out.println(" ");
		}
	}

}
