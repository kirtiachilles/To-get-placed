package com.collection;

import java.util.*;
public class MyListIterator {

	public static void main(String[] args) {
		
		List<String> myList= new ArrayList<String>();
		myList.add("UNIX");
		myList.add("C");
		myList.add("C++");
		myList.add("Java");
		
		ListIterator<String> litr=null;
		litr=myList.listIterator();
		
		System.out.println("Printing Elements in Forward Direction");
		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		
		System.out.println("Printing Elements in Backward Direction");
		while(litr.hasPrevious()){
			System.out.println(litr.previous());
		}
	}

}
