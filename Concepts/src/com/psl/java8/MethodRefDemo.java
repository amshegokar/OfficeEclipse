package com.psl.java8;

public class MethodRefDemo {

	public static void main(String[] args) {
		
		Interf i1=MethodRefDemo :: m2;
		System.out.println(i1.m1(50, 60));;
		
	}
	
	public static int m2(int x,int y) {
		System.out.println("Thousands of line of code goes............here");
		return x+y;
	}
}


interface Interf{
	public int m1(int a,int b);
}
