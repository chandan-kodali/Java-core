package com.chandan;

public class NumberPattern {

	public static void main(String[] args) {

		////////////////////////////////////
		for (int i = 1; i <= 4; i++) {

			for (int j = i; j > 0; j--) {

				System.out.print(" * ");
			}
			System.out.println(" ");
		}
/////////////////////////////////////////

		for (int i = 1; i <= 4; i++) {
			
			for (int j = 1; j <= 4; j++) {
				int k = i + j - 1;
				if(k>4)
				System.out.print(" " + (k-4));
				else
					System.out.print(" "+k);
			}
			System.out.println(" ");
		}
	/////////////////////////////////////
	
		/*boolean flagrow = false;
		for(int i=1; i<5 ;i++) {
			flagrow = !flagrow;
			boolean temp = flagrow;
			for(int j=1;j<=i;j++) {
				System.out.print(temp?" 1 ": " 0 ");
				temp = !(temp);

			}
			
			System.out.println(" ");
		}*/
		
		
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j+1)%2==1) 
					System.out.print(" 1 ");
				else
					System.out.print(" 0 ");
				
			}
			System.out.println(" ");
		}
	///////////////////////////////////////////////////
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+i);
			}
			System.out.println(" ");
		}
		
	}
	

}
