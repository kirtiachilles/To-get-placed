package com.kirti.string;

import java.util.*;

class CountPalindromes {

        public static void main(String[] args) {
                int count = 0;
                @SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
                System.out.print("Enter sentence: ");
                String str = input.nextLine();
                StringTokenizer stk = new StringTokenizer(str);
                while (stk.hasMoreTokens()) {
                        String words = stk.nextToken();
                        StringBuffer sb = new StringBuffer(words);
                        String reversedWords = sb.reverse().toString();
                        if (words.equalsIgnoreCase(reversedWords)) {
                        		System.out.println("Palindrome Words: "+words);	
                                count++;
                        }
                }
                System.out.println("Number of Palindromes in the string: "+ count);
               							
        }
}
	