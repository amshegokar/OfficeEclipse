package com.psl.java8;

import java.util.Optional;

public class Demo4 {

	public static void main(String[] args) {

		
		String name=null;
		//Optional<String> opt=Optional.of(name);//Null check implementation is provided by ofNullable()
		Optional<String> opt=Optional.ofNullable(name);
		//System.out.println(opt.get());
		
		if(opt.isPresent())
			System.out.println(opt.get());
		else
			System.out.println("Sorry you have not provided any value");
	}

}
