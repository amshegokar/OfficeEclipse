package com.psl.cone;

public class Employee1 implements Cloneable {
	private int id;
	private String name;

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

	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee1() {
		// TODO Auto-generated constructor stub
	}
	


	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + "]";
	}


	public static void main(String[] args) {
		
		
		Employee1 employee1=new Employee1(500, "AtulShegokar");
		
		try {
			Employee1 cloneEmp=(Employee1)employee1.clone();
			System.out.println(cloneEmp);
			
			cloneEmp.setId(5555);
			cloneEmp.setName("Bhavaaaaaaaaaaaa");
			System.out.println("After making changes to clonned object the original object is :"+employee1);
			System.out.println();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
