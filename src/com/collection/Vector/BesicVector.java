package com.collection.Vector;

import java.util.*;
public class BesicVector {

	public static void main(String[] args) {
		
		Vector<String> list=new Vector<String>();
		String str[]={"JAVA","ORACLE","JSP","SERVLET","EJB","PHP","PERL"};
		
		list.addAll(Arrays.asList(str));
		System.out.println(list);

		System.out.println("Add Elem at 4th position");
		list.add(4,"JAVA SCRIPT");
		System.out.println(list);
		
		System.out.println("get element at position 5 -"+list.get(5));
		
		System.out.println("first element in the vector -"+list.firstElement());
		
		System.out.println("last element in the vector -"+list.lastElement());
		
//		list.clear();/* to remove all the element from the vector*/
		
		System.out.println("Vector is empty? "+list.isEmpty());
		
//		to iterate using iterator
		System.out.println("Using Iteration");
		Iterator<String> itr= list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
//		iterate using enumeration
		System.out.println("Using Enumeration");
		Enumeration<String> enm=list.elements();
				while(enm.hasMoreElements())
					System.out.println(enm.nextElement());
				
//		To clone a vector
		@SuppressWarnings("unchecked")
		Vector<String> vcopy=(Vector<String>) list.clone();
		System.out.println("Cloned vector vcopy "+vcopy);
	}
	

}
