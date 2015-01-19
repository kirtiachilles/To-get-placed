package com.collection.LinkedList;

import java.util.*;
public class MyLinkedList {

	public static void main(String a[]){
        
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Orange");
        ll.add("Apple");
        ll.add("Grape");
        ll.add("Banana");
    
//      to add elements at first position
        ll.addFirst("Strawberry");
        ll.offerFirst("Mango");
        System.out.println(ll);
        System.out.println("Size of the linked list: "+ll.size());
        System.out.println("Is LinkedList empty? "+ll.isEmpty());
        System.out.println("Does LinkedList contains 'Grape'? "+ll.contains("Grape"));
        
//        shuffle the elements of linkedlist
        
        Collections.shuffle(ll);
        System.out.println("After shuffle"+ll);
        
//        to iterate linked list in reverse order
        
        Iterator<String> itr=ll.descendingIterator();
        while(itr.hasNext())
        	System.out.println(itr.next());
    
//		push and pop operation in linked list
        ll.push("PineApple");
        System.out.println("After Push"+ll);
        ll.pop();
        System.out.println("After pop"+ll);
        
	}
	
}

