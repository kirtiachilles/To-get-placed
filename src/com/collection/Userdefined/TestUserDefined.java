package com.collection.Userdefined;
import java.util.*;

public class TestUserDefined {

	public static void main(String[] args) {
		LinkedList<UserdefinedCollection> ll=new LinkedList<UserdefinedCollection>();
		
		ll.add(new UserdefinedCollection("Kirti","662 Wadgaon BK","Pune","41"));
		ll.add(new UserdefinedCollection("Rohit","Wadgaon BK","Pune","41"));
		ll.add(new UserdefinedCollection("Apoorva","Kondhwa","Pune","48"));
		
		for(UserdefinedCollection uc:ll){
			System.out.println(uc+ "\n");
		}
	}

}
