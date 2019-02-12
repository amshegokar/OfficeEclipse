package com.psl.data;

import com.psl.data.Test1.TT;

public class TestTest implements TT{

	
	public static void main(String[] args) {
		
		Test1 t=new Test1() {
			
		};
		t.m1();
		TT.m3();
	}
}


class Test1{
	
	public void m1() {
		System.out.println("AIS");
	}
	
	interface TT{
		default public void m1() {
			System.out.println("m1 default");
		}
		
		default public void m2() {
			System.out.println("m2 default");
		}
		
		static public void m3() {
			System.out.println("m3 static");
		}
	}
}