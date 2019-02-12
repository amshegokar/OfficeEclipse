package com.logical;

import java.util.HashMap;

public class DuplicateWordCount {

	public static void main(String[] args) {
		
		
		String []date= {"Atul","Shegokar","Bhavana","Shegokar","Amol","Many","Sonay","Many","Sonay","Sony"};
		
		HashMap<String, Integer> hm=new HashMap<String,Integer>();
		
		
		for (int i = 0; i < date.length; i++) {

			if (hm.containsKey(date[i])) {
				hm.put(date[i], hm.get(date[i]) + 1);
			} else {

				hm.put(date[i], 1);
			}

		}
		
		System.out.println(hm);
	}
}
