package com.goyal.dsa_sorting;

import java.util.Scanner;

public class InsertionSort {
	
	static void insertionSort(int n, int[] nums) {
        for(int i=0; i<n; i++){
        	int j=i;
        	while(j>0 && nums[j-1]>nums[j]) {
        		int temp = nums[j-1];
        		nums[j-1] = nums[j];
        		nums[j] = temp;
        		j--;
        	}
        }
    }

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			insertionSort(n, arr);
			for (int x : arr) {
				System.out.print(x + " ");
			}
		}

	}

}
