/* Program to demonstrate StringBuilder withit's append() method */
import java.util.Scanner;
public class StringBuilderDemo{

    public static void main (String [] args) {
    	 
    	System.out.print("Enter the String :");
    	Scanner sin=new Scanner(System.in);
    	String str=sin.nextLine();
    	System.out.println("String Entered "+str);
    	
		System.out.println (removeCharInString (str, 'a'));            
       }

      public static String removeCharInString (String string, char charToBeRemoved) {

        if (string == null)
             return "";
       
        StringBuilder strBuild = new StringBuilder();

        for (int i = 0; i < string.length (); i++) {
            char chr = string.charAt (i);
            if (chr == charToBeRemoved)
                continue;
            strBuild.append (chr);
        }
        return strBuild.toString ();
    }
}
