import java.util.Arrays;public class SortArrayElements {	public static void main(String[] args) {		String[] arr = new String[]{"Fan", "dexter", "abc", "fruit", "apple", "banana"};		bubbleSort(arr);		System.out.println("The strings in the sorted order of length are: ");				String str = convertStringArrayToString(arr);		printCapitalized(str);		/*for (String item : arr) {			System.out.println(item);		}*/	}		private static String convertStringArrayToString(String[] strArr) {        StringBuilder sb = new StringBuilder();        for(String str : strArr) sb.append(str);        return sb.toString();    }		 static void printCapitalized( String str ) {	      char ch;       // One of the characters in str.	      char prevCh;   // The character that comes before ch in the string.	      int i;         // A position in str, from 0 to str.length()-1.	      prevCh = '.';  // Prime the loop with any non-letter character.	      for ( i = 0;  i < str.length();  i++ ) {	         ch = str.charAt(i);	         if ( Character.isLetter(ch)  &&  ! Character.isLetter(prevCh) ) {	            System.out.print( Character.toUpperCase(ch) );	            	         }		         else {	        	 	            System.out.print( ch );	            	            prevCh = ch;  // prevCh for next iteration is ch.	         }	      }	      System.out.println();	   }	// Mutates the original array	public static void bubbleSort(String[] arr) {		boolean swapped = false;		do {			swapped = false;			for (int i = 0; i < arr.length - 1; i += 1) {				if (arr[i].length() > arr[i + 1].length()) {					swap(arr, i, i + 1);					swapped = true;				}			}		} while (swapped);	}	// Mutates the original array	public static void swap(String[] arr, int index0, int index1) {		String temp = arr[index0];		arr[index0] = arr[index1];		arr[index1] = temp;	}}