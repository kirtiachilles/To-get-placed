/* You can iterate through any collection object by using Iterator object. 
 * It provides two methods to iterate. The hasNext() method returns true if 
 * the iteration has more elements. The next() method returns the next element in the iteration.
 * Below example shows how to iterate through an ArrayList.  
 * Also to remove an element from the collection 
 */

package com.collection;

import java.util.*;

public class MyCollectionIterator {

	public static void main(String[] args)
	{
		List<String> myList= new ArrayList<String>();
		myList.add("UNIX");
		myList.add("C");
		myList.add("C++");
		myList.add("Java");
		System.out.println("Before Removing "+myList);
		Iterator<String> it=myList.iterator();
		/*while(it.hasNext())
			System.out.println(it.next());
		*/
		String removeElem="C++";
		while(it.hasNext()){
			if(removeElem.equals(it.next()))
				it.remove();
		}
		
		System.out.println("After Removing "+myList);

	}
}
