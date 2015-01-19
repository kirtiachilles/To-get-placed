package com.collection;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]={26,65,98,12,45,98,96};
		int i,j,temp;
		
		System.out.println("****Bubble Sort**** \nBefore Sorting");
		for(i=0;i<7;i++){
			System.out.println(arr[i]);			
		}
		
		for(i=0;i<7;i++){
			for(j=0;j<6-i;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("After Sorting");
		for(i=0;i<7;i++){
			System.out.println(arr[i]);
		}
	}

}
