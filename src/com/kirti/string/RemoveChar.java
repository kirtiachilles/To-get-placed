package com.kirti.string;

import java.util.Scanner;

public class RemoveChar {
	public static void main (String [] t) {
	       
        System.out.println (removeCharInString ("kirtiwardhan",  'a'));
        System.out.println(reverseString());
   
      }

     private static String reverseString() {
    	 
    	 String original,reverse="";
    	 int length;
    	 @SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
    	 original=scan.nextLine();
    	 
    	 length=original.length();
    	 for(int i=length-1;i>=0;i--){
    		 reverse=reverse+original.charAt(i);
    	 }
    	 return reverse;
	}

	public static String removeCharInString (String string, char charToBeRemoved) {

       if (string == null)
            return null;
      
           StringBuilder strBuild = new StringBuilder ();

       for (int i = 0; i < string.length (); i++) {
           char chr = string.charAt(i);
           if (chr == charToBeRemoved)
               continue;
           strBuild.append (chr);
       }
       return strBuild.toString ();
   }
     
    

}
