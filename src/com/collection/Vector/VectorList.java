package com.collection.Vector;

import java.util.*;
public class VectorList {

	public static void main(String[] args) {
		Vector<String> v1=new Vector<String>();
		String str[]={"JAVA","ORACLE","JSP","SERVLET","EJB","PHP","PERL"};

		v1.addAll(Arrays.asList(str));
		 List<String> list=new ArrayList<String>();
		 list.add("JAVA");
//		 list.add("")
		 list.add("SERVLET");
		 
		 System.out.println("Does vector contatins all the item in the list? "+v1.containsAll(list));
		 list.add("VC++");
		 System.out.println("Does vector contatins all the item in the list? "+v1.containsAll(list));
		 
//		 COPY VECTOR ELEMENTS INTO ARRAY
		 
		 String copy[]=new String[v1.size()];
		 v1.copyInto(copy);
		 for(int i=0;i<copy.length;i++)
			 System.out.println(copy);
		
		 
	/*	 for(String str1:copy)
			 System.out.println(copy);
	*/
//		 get sublist from vector
		 
		 List<String> lst=v1.subList(2, 5);
		 System.out.println(lst);
		 
	}

	

}
