package com.psl.singleton;

import java.util.ArrayList;
import java.util.List;

public class MySingleTon {
	
	public static void main(String[] args) {
		
		
		
		int oneMillion_ = 1_000_000; //new
	    int oneMillion = 1000000;
	    if (oneMillion_ == oneMillion){
	        System.out.println(true);
	    } else{
	        System.out.println(false);
	    }
		 int binary = 8;
	        if (binary == 8){
	            System.out.println(true);
	        } else{
	            System.out.println(false);
	        }
		
	        
	        int binary1 = 0b1000; //2^3 = 8
	        if (binary1 == 8){
	            System.out.println(true);
	        } else{
	            System.out.println(false);
	        }
		
		
		int x[]= {10,20,5,45,60,70,30,100,90};
		
		int max=x[0];
		int smax=x[1];
		for(int i=0;i<x.length-1;i++) {
			
			if(max<x[i])
				max=x[i];
			
			if(smax<max)
				smax=x[i];
			
			
		}
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(max);
		System.out.println(smax);
		
	}
	
	
	public void testDinamond1(){
	    List list = new ArrayList<>();
	   // Map> map = new HashMap<>();
	}
	public void testDinamond(){
	    List list = new ArrayList();
	    //Map> map = new HashMap>();
	}

}


class Singleton{
	private static Singleton singleton;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(singleton==null) {
			singleton=new Singleton();
		}
		return singleton;
	}
}