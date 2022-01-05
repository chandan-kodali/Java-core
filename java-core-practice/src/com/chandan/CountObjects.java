package com.chandan;
/**
 * 
 * @author Karuna
 *
 */
public class CountObjects {
	static int count=0;
public CountObjects() {
	count++;
}
	public static void main(String[] args) {

		CountObjects c1 = new CountObjects();
		new CountObjects();
		new CountObjects();
		new CountObjects();
		System.out.println(CountObjects.count);
		
	}

}
