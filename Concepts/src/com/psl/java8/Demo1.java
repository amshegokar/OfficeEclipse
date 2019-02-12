package com.psl.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {
		
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(100);
		list.add(101);
		list.add(104);
		list.add(17);
		list.add(87);
		
		list.stream().filter(i->i>20).map(i->i+5).forEach(System.out::println);;
		
		System.out.println("------------------");
		List listMy=list.stream().filter(i->i>20).map(i->i+4).collect(Collectors.toList());
		listMy.forEach(System.out::println);
		
		
		System.out.println("------------------");
		System.out.println();
		Stream<Integer> s1=list.stream();
		s1.forEach(System.out::println);

		System.out.println();
		
		//Intermediate operation are like map, filter, seek
		
		//Terminal operation foreach, count, collector
		Stream<Integer> s2=list.stream().map(i->i+1);
		s2.forEach(i->System.out.println(i));
		
		
		Stream<Integer> s3=list.stream();
		
		
		
	}
}
