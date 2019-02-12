package com.serial;

public class MutuableKeys {

	private int i;
	private int j;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	@Override
	public String toString() {
		return "MutuableKeys [i=" + i + ", j=" + j + "]";
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
		MutuableKeys other = (MutuableKeys) obj;
		if (i != other.i)
			return false;
		if (j != other.j)
			return false;
		return true;
	}
	public MutuableKeys(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	
	
	
	public static void main(String[] args) {
		
		MutuableKeys keys=new MutuableKeys(20, 30);
		System.out.println(keys.hashCode());
		keys.setI(40);
		keys.setJ(50);
		
		System.out.println(keys.hashCode());
		
		
	}
}
