package com.collection.Hashtable;

import java.util.*;
public class MyHashtableMethods {

	public static void main(String[] args) {
	
		Hashtable<Emp, String> ht= new Hashtable<Emp, String>();
		ht.put(new Emp(123,"Kirti",256000), "Kirti");
		ht.put(new Emp(134,"Ram",3000), "RAM");
	    ht.put(new Emp(235,"John",6000), "JOHN");
	    ht.put(new Emp(876,"Crish",2000), "CRISH");
	    ht.put(new Emp(512,"Tom",2400), "TOM");
		System.out.println("Fetching values from the Hashtable crating key");
		
		Emp e=new Emp(876,"Crish",2000);
		System.out.println(e+"==>"+ht.get(e));
	}
}

class Emp{
	
	private int id;
	private String name;
	private int sal;
	
	
	
	public Emp(int id, String name, int sal) {
//		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		Emp e=null;
		if(obj instanceof Emp){
			e=(Emp) obj;
		}	
		System.out.println("In equals");
		if(this.getId()== e.getId())
			return true;
		else 
			return false;
	}
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", sal=" + sal + ", id=" + id + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getId();
	}
}
