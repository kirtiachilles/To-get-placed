package com.collection.ArrayList;

import java.util.*;
public class MyArrayList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		String str[]={"JAVA","ORACLE","JSP","SERVLET","EJB","PHP","PERL"};
		
		al.addAll(Arrays.asList(str)); System.out.println("aslist"+al+"\n");
		
//		Collections.addAll(al, str); System.out.println(al);
		
		
		System.out.println("Does list contains Oracle "+al.contains("ORACLE")+"\n");
		System.out.println("Index of Perl "+al.indexOf("PERL")+"\n");
		
//		to create a clone of a arrayList
		
		ArrayList<String> al2=(ArrayList<String>)al.clone();
		System.out.println("Clone araylist"+al2+"\n");
	
//		to copy arrayList element into the array
		
		String str1[]=new String[al.size()];
		al.toArray(str1);
		System.out.println("Created array content \n");
		for(String str2:str1)
			System.out.println(str2);
	}
}
