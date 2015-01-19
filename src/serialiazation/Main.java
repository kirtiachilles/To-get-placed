package serialiazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Main {

	public static void main(String[] args) {
		String filename = "personobj.txt";
		Person[] p = {new Person("kirti", "tandale"), new Person("Shruti","Hankare"), new Person("Suraj", "Shekokar")};
		
		// save the object to file
		FileOutputStream fos = null;
		ObjectOutputStream out = null;		
		
		try {
			fos = new FileOutputStream(filename);
			out = new ObjectOutputStream(fos);		
			out.writeObject(p);
			out.close();
		} catch (FileNotFoundException e) {			
			System.out.println("Exception occured "+e.getMessage());
		} catch (IOException e) {			
			System.out.println("Exception occured "+e.getMessage());
		}
		
		 // read the object from file
		FileInputStream fin = null;
		ObjectInputStream in = null;
		Person[] temp = null;

		try {
			fin = new FileInputStream(filename);
			in = new ObjectInputStream(fin);
			
			temp = (Person[]) in.readObject();
			System.out.println("data aquired");
						
			in.close();
		} catch (Exception e) {
			System.out.println("Exception occured "+e.getMessage());
		}
		System.out.println("Data in the Serialized object >>");
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}		
	}
}
