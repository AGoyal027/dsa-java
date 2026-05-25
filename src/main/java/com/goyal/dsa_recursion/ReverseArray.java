package com.goyal.dsa_recursion;

import java.util.Scanner;

public class ReverseArray {
	
	static void reverseArrayI(int i, int n, int[] nums) {
		if(i>=n/2) {
			return;
		}
		int temp = nums[n-i-1];
		nums[n-i-1]=nums[i];
		nums[i]=temp;
		reverseArrayI(i+1, n, nums);
    }
	
	static void reverseArrayII(int i, int n, int[] nums) {
		if(i>=n) {
			return;
		}
		int temp = nums[n];
		nums[n]=nums[i];
		nums[i]=temp;
		reverseArrayII(i+1, n-1, nums);
    }

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			reverseArrayI(0, n, arr);
			//reverseArrayII(0, n-1, arr);
			for (int x : arr) {
				System.out.print(x + " ");
			}
		}

	}

}
