package com.psl.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		System.out.println(System.getProperty("java.classpath"));;
		
		
		HashMap hm=new HashMap();
		System.out.println("Before Adding any elment inside Map, The size is :"+hm.size());
		
		System.out.println(hm.put("chiranjeevi", 700));;
		hm.put("balaiah", 800);
		hm.put("venktesh", 1000);
		hm.put("nagarjuna", 500);
		System.out.println(hm.put("nagarjuna", 25555));;
		System.out.println("Before Adding any elment inside Map, The size is :"+hm.size());
		System.out.println(hm);
		
		System.out.println(hm.put("chiranjeevi", 1000));
		Set s=hm.keySet();
		System.out.println("Iterating using Iterator over Map");
		Iterator i1=s.iterator();
		while (i1.hasNext()) {
			String ss = (String) i1.next();
			
			System.out.println("Key is :"+ss+ " Value is :"+hm.get(ss));
		}
		System.out.println("Getting only all values from Map");
		Collection c=hm.values();
		System.out.println(c);
		
		
		System.out.println("Iterating over HashMap using entry() method");
		Set s1=hm.entrySet();
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
			if(m1.getKey().equals("nagarjuna"))
				m1.setValue("Atul");
		}
		
		System.out.println(hm);
	}

}
