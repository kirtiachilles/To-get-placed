package com.collection;

import java.util.*;
public class myClassEnum {

	public static void main(String[] args) {
		
		String str[]={"JAVA","ORACLE","JSP","SERVLET","EJB","PHP","PERL"};
		/*for(String str1:str)
			System.out.println(str1);
		*/
		Vector<String> lang=new Vector<String>();
		Enumeration<String> en= null;
		
		lang.addAll(Arrays.asList(str));
//		Collections.addAll(lang, str);
		en=lang.elements();
		while(en.hasMoreElements())
			System.out.println(en.nextElement());
	}

}
