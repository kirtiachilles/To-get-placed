package com.collection.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Comparator;

public class MyLinkedListSort {

	public static void main(String[] args) {
	
		LinkedList<Emp> ll=new LinkedList<Emp>();
		ll.add(new Emp("Kirti",10000));
		ll.add(new Emp("Shruti",20000));
		ll.add(new Emp("Sid",25000));
		ll.add(new Emp("Suraj",60000));
		ll.add(new Emp("Preety",36000));
		Collections.sort(ll, new MysalComp());
		System.out.println("Sorted List Enrties");
		for (Emp emp : ll) {
			System.out.println(emp);
		}
	}
}


class Emp{
	 private String name;
	 private int salary;
	 
	public Emp(String name, int sal)
	{
		this.name=name;
		this.salary=sal;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}