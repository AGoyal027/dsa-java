package com.goyal.dsa_sorting;

import java.util.Scanner;

public class SelectionSort {
	
	public static int[] selectionSort(int n, int[] nums) {
        for(int i=0; i<=n-2; i++){
            int min=i;
            for(int j=i; j<=n-1; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			selectionSort(n, arr);

			for (int x : arr) {
				System.out.print(x + " ");
			}
		}

	}

}
