package com.collection.TreeSet;

import java.util.*;
public class MyTreeSet {

	public static void main(String[] args) {
		List<String> ls=new ArrayList<String>();
			ls.add("Kirti");
			ls.add("Shruti");
			ls.add("Sid");
			ls.add("Preety");
			ls.add("Suraj");
		System.out.println("Elements of the list are: "+ls);	
//		CREATING TREESET USING LIST	
		TreeSet<String> ts=new TreeSet<String>(ls);
		System.out.println("Elements of the Treesets are: "+ts);
	}

}
