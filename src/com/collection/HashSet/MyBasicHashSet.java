package com.collection.HashSet;

/* This program contains the demonstration for hashSet and linkedHashset */
 
import java.util.HashSet;
import java.util.LinkedHashSet;

public class MyBasicHashSet {
 
    public static void main(String a[]){
        HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println(hs);
        System.out.println("Is HashSet empty? "+hs.isEmpty());
//      hs.remove("third");
        System.out.println(hs);
        System.out.println("Size of the HashSet: "+hs.size());
        System.out.println("Does HashSet contains first element? "+hs.contains("first"));

        LinkedHashSet<String> lhs=new LinkedHashSet<String>();
//      lhs.addAll(hs);
        lhs.add("kirti");
        lhs.add("shruti");
        lhs.add("sid");
        lhs.add("suraj");
        System.out.println("content of LinkedHashSet "+lhs);
        
//		TO RETAIN ALL ELEMENTS COMMON IN BOTH THE SETS        
        HashSet<String> subSet = new HashSet<String>();
        subSet.add("rat");
        subSet.add("second");
        subSet.add("first");
        
        hs.retainAll(subSet);
        System.out.println("Contains of the hashset are :"+hs);
       
        
    }
}