package com.psl.java8;

import java.util.Optional;

public class Demo6 {

	public static void main(String[] args) {
		String name="Sabri";
		//Optional<String> opt=Optional.of(name);//Null check implementation is provided by ofNullable()
		String opt=Optional.ofNullable(name).orElse("Balaji");
		//System.out.println(opt.get());
		
		 
	}

}
