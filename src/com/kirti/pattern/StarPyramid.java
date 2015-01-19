package com.kirti.pattern;

import java.util.Scanner;

public class StarPyramid {

	public static void main(String[] args) {		
		int row, col, k, sp, line, count;
		Scanner sin = new Scanner(System.in);
		System.out.print("Enter number of lines : ");
		line = sin.nextInt();
		sin.close();
		
		count = 1;
		sp = line;
		for(row = 1; row <= line; row++){
			for (k = 1; k < sp; k++) {
				System.out.print(" ");
			}
			for (col = 1; col <= row; col++) {
				System.out.print("*");				
				if (row > 1 && count < row) {
					System.out.print("A");					
					count ++;
				}
			}
			System.out.println();
			sp--;
			count = 1;
		}
	}

}
