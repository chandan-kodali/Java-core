package com.chandan;

public class LabeledUnlabelledBreak {

	public static void main(String[] args) {

		chandan:
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==3)
					//break;  // unlabled break
				break chandan; //labeled break;
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}

}
