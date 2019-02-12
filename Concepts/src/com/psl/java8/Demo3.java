package com.psl.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {

	public static void main(String[] args) {
		 Employee [] employees= {
				 
				 new Employee(101, "Atul", 12345.45f),
				 new Employee(102, "Amol", 578.45f),
				 new Employee(103, "Sujeet", 88345.45f),
				 new Employee(104, "Bhavan", 1555.45f),
				 new Employee(105, "Sharaddha", 1345.45f)
		 };

		 
		 
		 
		 // peek is not terminal operation---it is an intermediate operation
		 List<Employee>empList= Arrays.asList(employees);
		 empList.forEach(System.out::println);
		 
		 System.out.println("Incremented salary");
		 empList.stream().peek(e->e.salaryIncrement(10f)).peek(System.out::println).collect(Collectors.toList());
	}

}
