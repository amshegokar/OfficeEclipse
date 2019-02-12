package com.logical;

public class LeftRightSumEqulPrintArrayElement {

	public static void main(String[] args) {
		 
		
		int array[]= {5,0,10,3,6,3,1,5,28};
		
		System.out.println(array.length);
		
		for(int i=0;i<array.length;i++) {
			
			
			int leftSum=0;
			int rightSum=0;
			
			
			for(int j=0;j<i;j++) {
				leftSum=leftSum+array[j];
			}
			
			for(int k=i+1;k<array.length;k++) {
				rightSum=rightSum+array[k];
			}
			
			System.out.println("Left Sum is : "+leftSum+" Right Sum is:"+rightSum +" for elment :"+array[i]);
			if(leftSum==rightSum) {
				System.out.println("Element Found: "+array[i]);
			}
		}

	}

}
