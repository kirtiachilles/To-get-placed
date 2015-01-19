package com.collection.Userdefined.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EmployeeSort {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1,"kirti","tandale");
		Employee emp2 = new Employee(5,"shruti","hankare");
		Employee emp3 = new Employee(3,"preity","hankare");
		Employee emp4 = new Employee(4,"siddhi","shekokar");
		Employee emp5 = new Employee(2,"shekokar","suraj");
		
		List<Employee> employees = new ArrayList<Employee>();

		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);

		System.out.println("Employees before sorting");

		for(Employee emp : employees){
			System.out.println(emp);
		}

		Collections.sort(employees);
		System.out.println("Employees after sorting");

		for(Employee emp : employees){
			System.out.println(emp);
		}
	/*
		Employee[] emp={
		new Employee(1,"kirti","tandale"),
		new Employee(5,"shruti","hankare"),
		new Employee(3,"preity","hankare"),
		new Employee(4,"siddhi","shekokar"),
		new Employee(2,"suraj","shekokar")
		};
		
		Arrays.sort(emp);
		System.out.println(Arrays.asList(emp));*/
	}		

}
