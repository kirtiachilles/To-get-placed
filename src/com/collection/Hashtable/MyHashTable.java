package com.collection.Hashtable;

import java.util.*;
public class MyHashTable {

	public static void main(String[] args) {
		
		Hashtable<String, String> ht=new Hashtable<String, String>();
		ht.put("first","Kirti");
		ht.put("second", "Shruti");
		ht.put("third", "Sid");
		
		System.out.println("Index of the second element in the "+ht.get("second"));
		System.out.println("Is hash table is epmty ? "+ht.isEmpty() +" Size "+ht.size());
		ht.remove("second");
		System.out.println(ht);		
	
//		to iterate through the hashtable use set
		
		Set<String> st=ht.keySet();
		for(String key: st)
			System.out.println("Value of the "+key+" is: "+ht.get(key));	
		
//		TO ITERATE THROUGH HASHTABLE USING ENUMERATION
		System.out.println("ITERATE THROUGH THE HASH TABLE");
		Enumeration<String> en=ht.keys();
		while(en.hasMoreElements()){
			String key2=en.nextElement();
			System.out.println("The key: "+key2+" value is: "+ht.get(key2));
		}
		
//		to get all keys from the hashtable
		
		Set<String> st1=ht.keySet();
		for(String key1: st1)
			System.out.println(key1);
				
//		to check whether the hash table coantains the keys or not
		
		 if(ht.containsKey("first")){
	            System.out.println("The Hashtable contains key first");
	        } else {
	            System.out.println("The Hashtable does not contains key first");
	        }
		 
//		 TO SEARCH VALUE INTO THE HASHTABLE
		 
		 if(ht.containsValue("Kirti"))
			 System.out.println("Hashtable contains the value");
		 else			 
			 System.out.println("Hashtable does not contains the value");
		 
//		TO DELETE ALL ELEMENTS IN THE HASHTABLE
		 
	/*	
	  	ht.clear(); 	 
	 */
	}

}


		
		
	