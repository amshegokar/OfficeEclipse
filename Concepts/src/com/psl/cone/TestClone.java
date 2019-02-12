package com.psl.cone;

public class TestClone {
	
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
