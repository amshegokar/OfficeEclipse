package com.psl.data;

public class DefaultMethod implements InterfaceDefault {

	@Override
	public void m2() {
		System.out.println("This is abstract method imple");
		
	}
	
	public static void main(String[] args) {
		
		DefaultMethod defaultMethod=new DefaultMethod();
		defaultMethod.m1();
		defaultMethod.m2();
	}

}


interface InterfaceDefault{
	default public void m1(){
		System.out.println("This is a default method implemenataion from interface");
	}
	
	void m2();
	
}