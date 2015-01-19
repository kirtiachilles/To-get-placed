package com.kirti.string;
import java.io.*;
public class BuffereReader
{   
    

	public static  void main(String[] args) throws Exception {
	
	System.out.println("Enter the String Here:\n");
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    String s = br.readLine();
   
    String[] str =s.split(" ");
    StringBuffer buffer = new StringBuffer();
    for(int i=str.length-1;i>=0;i--)
    {
        buffer.append(str[i]);
        buffer.append(" ");
    }
    System.out.println("\nOriginal string: " + s);
    System.out.println("Reverse word string:"+buffer.toString());
    }
	
}