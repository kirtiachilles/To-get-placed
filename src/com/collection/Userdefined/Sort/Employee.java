package com.collection.Userdefined.Sort;

/*Using Comparable interface*/

public class Employee implements Comparable<Employee>{

	private int id;
	private String firstName;
	private String lastName;

	Employee(int id, String firstName, String lastName){
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}

//	compareTo method is overridden so that the Employee objects can be written. 
	/*public integer compareTo(Employee employee){
		return this.firstName.compareTo(employee.getFirstName());
	}*/
	// to sort integer value
	public int compareTo(Employee employee){
		return this.id - employee.getId();
	}

}
