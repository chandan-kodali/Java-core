package com.chandan;
/**
 * Runtime polymorphism
 * @author Chandan
 *
 */
public class DynamicMethodDispath {

	public static void main(String[] args) {

		C c = new C();
		B b = new B();
		
		C c2 = b;
		c2.show();
		
	}

}

class C{
	
	public void show() {
		System.out.println("In Class C..");
	}
	
}
class B extends C{
	public void show() {
		System.out.println("In Class B..");
	}
	public void show(String s) {
		System.out.println("In calls B--"+s);
	}
}
