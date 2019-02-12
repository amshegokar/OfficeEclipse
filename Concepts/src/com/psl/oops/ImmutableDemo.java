package com.psl.oops;

import java.util.HashMap;
import java.util.Map;

public class ImmutableDemo {

	
	public static void main(String[] args) {
		
		String s1=new String("Atul");
		
		
		//System.out.println("Atul".hashCode());
		//System.out.println(s1.hashCode());
		//s1.concat("Shegokar");
		
		//System.out.println("After change"+s1.hashCode());
		
		/*Immutable im=new Immutable(10, 20);
		
		System.out.println("Before Change:"+im.hashCode());
		
		im.setJ(100);
		im.setI(50);
		
		System.out.println(im);
		System.out.println("After Change:"+im.hashCode());
		System.out.println("After Change:"+im.getI());
		*/
		Map<Immutable,Integer> map=new HashMap<Immutable,Integer>();
		Immutable i1=new Immutable(10, 20);
		Immutable i2=new Immutable(30, 40);
		Immutable i3=new Immutable(50, 60);
		map.put(i1, 30);
		map.put(i2, 70);
		map.put(i3, 110);
		
		System.out.println(map);
		
		System.out.println("Before Change:"+map.get(new Immutable(30, 40)));

		
		System.out.println("After Change:"+map.get(new Immutable(30, 40)));
	}
}


final class  Immutable{
	private final int i;
	private final  int j;
	public Immutable(int i, int j) {
		 
		this.i = i;
		this.j = j;
	}
	public int getI() {
		return i;
	}
 
	public int getJ() {
		return j;
	}
	 
	@Override
	public String toString() {
		return "Immutable [i=" + i + ", j=" + j + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + j;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Immutable other = (Immutable) obj;
		if (i != other.i)
			return false;
		if (j != other.j)
			return false;
		return true;
	}
	
	
	
	
	
}

