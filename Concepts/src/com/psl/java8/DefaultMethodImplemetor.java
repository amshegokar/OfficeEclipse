package com.psl.java8;

public class DefaultMethodImplemetor implements Left,Right {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Left.super.m1();
		Right.super.m1();
	}
	
	public static void main(String[] args) {
		
		
		DefaultMethodImplemetor defaultMethodImplemetor=new DefaultMethodImplemetor();
		defaultMethodImplemetor.m1();
	}

}


interface Left{
	default public void m1() {
		System.out.println(" Left I m1() implementation");
	}
}

interface Right{
	default public void m1() {
		System.out.println(" Right I m1() implementation");
	}
}