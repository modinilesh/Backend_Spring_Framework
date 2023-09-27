package Sorting;

import java.util.Arrays;

public class SelectionSort {
	
	public static void selectionSort(int[] arr) {
		
		
		for(int i=0; i<arr.length-1; i++) {
			int index = i;
			
			//lets find minimum
			for(int j=i+1; j<arr.length; j++) {
				if(arr[index] > arr[j]) index = j;
			}
			
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,8,3,1,2,2,2,2,2,1,1,1,1,1,4,5,6,7,8,7,65,4};
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
			
	}

}
