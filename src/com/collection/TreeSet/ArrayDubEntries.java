/*
 * Program to remove duplicate entries from the array 
 */


package com.collection.TreeSet;

import java.util.*;
public class ArrayDubEntries {

	public static void main(String[] args) {
		
		String arr[]= {"Kirti","Kirti","kirti","Shruti","shruti","Sid","Preety"};
		
		List<String> ls= Arrays.asList(arr);
		
		TreeSet<String> ts=new TreeSet<String>(ls);
		
		System.out.println("Elements in the Set: "+ts);

		 String[] strArr = {"one","two","three","four","four","five"};
		 
			 System.out.println(Arrays.toString(strArr));
			 System.out.println(Arrays.asList(strArr));
		
		 
	        TreeSet<String> unique = new TreeSet<String>();
	        for(String str:strArr){
	            if(!unique.add(str)){
	                System.out.println("Duplicate Entry is: "+str);
	            }
	        }
	}

}
