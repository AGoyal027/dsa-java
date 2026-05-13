package com.goyal.dsa_java.array;

public class SecondSmallestElement {
	
	static int nums[] = { 5, 9, 4, 3, 7, 2 };

	public static void main(String[] args) {
		        int n = nums.length;
		        int smallest = nums[0];
		        int ssmallest = Integer.MAX_VALUE;
		        for(int i =1; i<n; i++ ){
		            if(nums[i] < smallest){
		            	ssmallest = smallest;
		                smallest = nums[i];
		            }
		            else if(nums[i]<ssmallest & nums[i]!=smallest){
		                ssmallest = nums[i];
		            }
		        }
		        System.out.println(ssmallest);;
		    }

}
