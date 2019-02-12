package com.psl.data;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

// Java program to demonstrate toString() method
public class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		// returns the Class object for the class
		// with the specified name
		Class c1 = Class.forName("java.lang.String");
		Class c2 = int.class;
		Class c3 = void.class;

		System.out.print("Class represented by c1: ");

		// toString method on c1
		System.out.println(c1.toString());

		System.out.print("Class represented by c2: ");

		// toString method on c2
		System.out.println(c2.toString());

		System.out.print("Class represented by c3: ");

		// toString method on c3
		System.out.println(c3.toString());

		Class c4 = Class.forName("Employee");
		System.out.println(c4.toString());
		
		Package package1=c4.getPackage();
		//System.out.println("Pakcage Name of Employee class is :"+package1.getName());
		Method method[]=c4.getDeclaredMethods();
		
		
		
		
		
		for (Method method2 : method) {
			System.out.println("--------------------------");
			System.out.println("Method Name:"+method2.getName()+" Return Type :"+method2.getReturnType().getTypeName());
			System.out.println("--------------------------");
		}
		
		
		Constructor[] cons=c4.getDeclaredConstructors();
		
		System.out.println("--------------------------");
		for (Constructor constructor : cons) {
			System.out.println(constructor.getName());
			
			Parameter []parameter=constructor.getParameters();
			for (Parameter parameter2 : parameter) {
				System.out.println(parameter2.getName().getClass().getName());
			}

			
			
		}
		System.out.println("--------------------------");
		
		Customer customer=new Customer(100, "Manoj", 123.45);
		
		 Class cust=customer.getClass();
		System.out.println(customer.getClass().getName());
	}
}



  class Customer {
	private int empNo;
	private String name;
	private double salary;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int empNo, String name, double salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}