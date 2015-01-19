package com.kirti.searchnsort;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {25,17,31,13,2};
		int i, j, temp, len;
		len = arr.length;
		
		System.out.println("Bubble - Sort");
		System.out.println("Array Before Sotring");		
		for(i = 0; i < len; i++)
			System.out.println(arr[i]);
		
		for ( i = 0; i < len ; i++) {
			for(j = 0; j < (len-1)-i; j++){
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Array After Sorting");
		for(i = 0; i < len; i++)
			System.out.println(arr[i]);
	}

}
