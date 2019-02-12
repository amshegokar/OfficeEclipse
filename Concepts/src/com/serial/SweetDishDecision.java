package com.serial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SweetDishDecision {

	public static void main(String[] args) {

		List<String> votes = new ArrayList<String>();
		votes.add("Gulab-jamum");
		votes.add("Laddu");
		votes.add("Jalebi");
		votes.add("Barfi");
		votes.add("Laddu");
		votes.add("Gulab-jamum");
		votes.add("Gulab-jamum");
		votes.add("Jalebi");
		votes.add("Gajar-halwa");
		votes.add("Gajar-halwa");
		votes.add("Barfi");
		votes.add("Gajar-halwa");

		System.out.println(whichSweetShouldIBring(votes));;

	}

	public static String whichSweetShouldIBring(List<String> votes) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String string : votes) {

			if (map.containsKey(string)) {
				map.put(string, map.get(string) + 1);
			} else {
				map.put(string, 1);
			}
		}

		//System.out.println(map);

		int maxValueInMap = (Collections.max(map.values()));
		//System.out.println("The maximum coutn in map i s:" + maxValueInMap);

		List<String> maxCountSweet = new ArrayList<String>();

		Set<String> s = map.keySet();

		for (String string : s) {

			if (map.get(string) == maxValueInMap) {
				maxCountSweet.add(string);
			}
		}

		//System.out.println(maxCountSweet);
		
	Object objectArray[]=maxCountSweet.toArray();
	
		Arrays.sort(objectArray);
		
		

		System.out.println();
		
		String sweetDish=(String) objectArray[objectArray.length-1];
		return sweetDish;

	}

}
