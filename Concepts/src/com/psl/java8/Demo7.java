package com.psl.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Demo7 {

	public static void main(String[] args) {
		 
		
		int max=1000000;
		
		List<String> values=new ArrayList<String>(max);
		
		for(int i=0;i<max;i++) {
			UUID uuid=UUID.randomUUID();
			values.add(uuid.toString());
		}
		long t1=System.nanoTime();
		//long count=values.stream().sequential().sorted().count();
		long count=values.stream().sequential().parallel().count();
		
		
		long t2=System.nanoTime();
		
		long milis=TimeUnit.NANOSECONDS.toMillis(t2-t1);
		
		
		System.out.println("Total time :"+milis);

	}

}
