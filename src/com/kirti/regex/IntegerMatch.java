package com.kirti.regex;

public class IntegerMatch {

	public static void main(String[] args) {
		System.out.println("-1234".matches("-?\\d+"));
		System.out.println("1234".matches("-?\\d+"));
		System.out.println("+9121".matches("-?\\d+"));
		System.out.println("+9124".matches("(-|\\+)?\\d+"));
	}

}
