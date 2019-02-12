package com.psl.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {

		List<List<String>> names = Arrays.asList(

				Arrays.asList("Atul", "Shegokar"), Arrays.asList("Sunder", "Pichai"), Arrays.asList("Steve", "Jobs"),
				Arrays.asList("MySource", "yourSouce","Yup Man you did it")

		);

		
		names.forEach(System.out::println);
		System.out.println();
		//Converting your list of list string TO list of string
		List<String> listNames=names.stream().flatMap(Collection::stream).collect(Collectors.toList());
		
		listNames.forEach(System.out::println);
	}
}
