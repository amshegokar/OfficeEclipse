package com.psl.annotation;

import java.util.Hashtable;

/*@MyCustomAnnotation(
	    studentName="Chaitanya",
	    stuAddress="Agra, India"
	)*/
public class MyClass extends PP{

	public static void main(String[] args) {
		
		
		int i;
		//System.out.println(i);
		String myString=null;
		//myString.length();
		//myString.concat("abc");
		Hashtable ht=new Hashtable();
		ht.put("Hi", "Hello");
		//ht.put(null, "This is null key");
		//ht.put("Key", null);
		
		
		int x=3,y=1;
		/*if(x=y)
			System.out.println("Hello");*/
		
		String xx="Atul Shegokar Shegokar	";
		System.out.println(xx.charAt(10));
		
		int t=0;
		for(;t<4;t+=2)
			System.out.println(t);
		System.out.println(t);
		
		System.out.println(count);
		//System.out.println(xxz);
		
		
		try {
			return;
		}finally {
			System.out.println("Hello from Finally................");
		}
		
		
	}
}


class PP{
	static int count=999;
	int xxz;
}
 