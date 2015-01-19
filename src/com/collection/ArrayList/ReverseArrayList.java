package com.collection.ArrayList;

import java.util.*;
public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		String str[]={"JAVA","ORACLE","JSP","SERVLET","EJB","PHP","PERL"};
				
		Collections.addAll(al, str);
		System.out.println(al);
		
		Collections.reverse(al);
		for(String str1:al)
			System.out.println(str1);
		
//		Shuffle the arraylist
		
		Collections.shuffle(al);
		for(String str1:al)
		System.out.println(al);
		
//		swap two elments in the list
		
		Collections.swap(al, 0, 1);
		System.out.println("After swapping");
		for(String str1:al)
			System.out.println(str1);
	}

}
