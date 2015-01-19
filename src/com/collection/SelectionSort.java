package com.collection;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[]={26,65,98,12,45,98,96};
		int i,j,temp;
		
		for(i=0;i<arr.length-1;i++){
			for(j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("AFter Sorting");
		for(i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
