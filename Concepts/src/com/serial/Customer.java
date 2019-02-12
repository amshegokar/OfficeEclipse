package com.serial;

import java.util.Date;

public class Customer {

	private int id;
	private String name;
	private Date dob;
	
	
	public Customer(int id, String name, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = new Date(dob.getTime());
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		
		return (Date)dob.clone();
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
	public static void main(String[] args) {
		
		Customer c1=new Customer(100, "Atul", new Date());
		
		System.out.println(c1);
		c1.getDob().setHours(24);
		c1.getDob().setMonth(6);
		System.out.println(c1);
		
	 
	}
	
}
