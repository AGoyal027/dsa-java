package com.goyal.dsa_java.array;

public class SecondLargestElement {
	
	static int nums[] = { 2, 5, 9, 4, 3, 7 };

	public static void main(String[] args) {
		        int n = nums.length;
		        int largest = nums[0];
		        int slargest = -1;
		        for(int i =1; i<n; i++ ){
		            if(nums[i] > largest){
		            	slargest = largest;
		                largest = nums[i];
		            }
		            else if(nums[i]>slargest & nums[i]!=largest){
		                slargest = nums[i];
		            }
		        }
		        System.out.println(slargest);;
		    }
}
