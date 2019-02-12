package com.psl.java8;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<String> supplier = () -> {
			String s1[] = { "Sunny", "Bunny", "Monty", "Gunny" };
			int x = (int) (Math.random() * 3 + 1);
			return s1[x];
		};
		
		System.out.println(supplier.get());

	}

}
