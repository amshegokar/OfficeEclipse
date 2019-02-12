package com.psl.data;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("try");
			System.out.println(10/0);
		}catch(NullPointerException ex){
			System.out.println("NullPointerException");
		}
		
		catch(ClassCastException ex) {
			System.out.println("ClassCastException");
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("Outside try catch finally............");
	}

}
