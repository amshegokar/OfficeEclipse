package com.psl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSizeMethod {

	public static void main(String[] args) {
		 
		
		List<Integer> al=new ArrayList<Integer>();
		
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		/*System.out.println(al.size());*/
		
		
		for(int i=0;i<al.size();i++) {
			
			/*System.out.println("The Current iteration is :"+i);
			System.out.println("Removing :"+al.get(i));*/
			al.remove(i);
			
		}
		
		System.out.println(al);

	}

}
