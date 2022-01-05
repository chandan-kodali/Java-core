package com.chandan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ClassInititation {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException, CloneNotSupportedException {

		A a = new A(); //using new keyword
		
		A a2 = a; //using reference
		a.i = 5;
		
		//using clone
		
		A a5 = (A) a.clone();
		
		
		
		//using deserialisation 
		File f = new File("obj.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		
		File f2 = new File("obj.txt"); 
		FileInputStream fis = new FileInputStream(f2);
		ObjectInputStream ois = new ObjectInputStream(fis);
		A a3 = (A)ois.readObject();
		System.out.println(a3.i);
		
		Class c = Class.forName("com.chandan.A"); //class name should be fully qualified name
		A a4 = (A)c.newInstance();
		a4.show();
		
	}
	
	

}
class A implements Serializable,Cloneable{
	int i;
	int j;
	void show() {
		System.out.println("In class A show method");
	}
	@Override
	public String toString() {
		return "A [i=" + i + ", j=" + j + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}