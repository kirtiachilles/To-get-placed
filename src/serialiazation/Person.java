package serialiazation;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable{
	private String fname;
	private String lname;
	@SuppressWarnings("unused")
	transient private Thread myThread;
	
	public Person(String fname, String lname ) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.myThread = new Thread();
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Person [ fname = " + fname + ", lname = " + lname + " ]";
	} 	
}
