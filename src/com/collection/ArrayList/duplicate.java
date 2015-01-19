package com.collection.ArrayList;

import java.util.*;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;



	public class duplicate {

	public static void main(String a[]){
	int[] numbers = { 1, 5, 23,5,23, 2, 1, 6, 3, 1, 8, 12, 3 };
	Arrays.sort(numbers);
	for(int j=1;j<numbers.length;j++)
		System.out.println(numbers[j]);
		
	for(int i = 1; i < numbers.length; i++) {
	if(numbers[i] == numbers[i - 1]) {
	System.out.println("Duplicate: " + numbers[i]);
		
	}
	
	}}
}
