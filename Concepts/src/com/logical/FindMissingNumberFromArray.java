package com.logical;

public class FindMissingNumberFromArray {

	public static void main(String[] args) {
		int array[]= {5,4,3,2,9,1,8,10,6};
		int sum=0;
		int actualSum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		System.out.println("The sum before missing element is :"+sum);
		
		System.out.println(array.length+1);
		for(int i=1;i<=array.length+1;i++) {
			actualSum=actualSum+i;
		}
		
		System.out.println("The  actual sum with missing element is :"+actualSum);

		System.out.println("The Missing element is :"+(actualSum-sum));
	}

}
