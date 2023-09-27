package Sorting;

import java.util.Arrays;

public class InsertionSort {
	
	public static void insertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && temp < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 4, 1, 0, 3};
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
