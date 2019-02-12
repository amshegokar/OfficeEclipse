package com.psl.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo5 {

	public static void main(String[] args) {

		List<String> companyNames = Arrays.asList("TechM","TCS", "Google", "Jobs","Wipro", "Amdocs","Infy",null);

		
		Optional<List<String>> listOfOptional=Optional.of(companyNames);
		Integer intResult=listOfOptional.map(List :: size).orElse(0);
		System.out.println(intResult);
		
		 
	}
}
