package com.kirti.pattern;
/*
 *   * 
    * * 
   * * * 
  * * * * 
 * * * * * 
 * 
 * */

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		int i, j, k, sp, line;
		Scanner sin = new Scanner(System.in);
		System.out.print("Enter number of lines : ");
		line = sin.nextInt();
		sin.close();
		sp = line;
		for(i = 1; i <= line; i++){
			for (k = 1; k < sp; k++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			sp--;
		}
	}

}
