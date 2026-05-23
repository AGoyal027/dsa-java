package com.goyal.dsa_sorting;

import java.util.Scanner;

public class BubbleSort {
	
	static void bubbleSort(int n, int[] nums) {
        for(int i=n-1; i>=1; i--){
            for(int j=0; j<=i-1; j++){
                if(nums[j] > nums[j+1]){
                	int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
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
			bubbleSort(n, arr);
			for (int x : arr) {
				System.out.print(x + " ");
			}
		}

	}

}
