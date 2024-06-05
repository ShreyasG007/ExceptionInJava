package com.tka.excpetionHandling;

public class Test {
	public static void main(String[] args) {
		Operation operation = new Operation();
		Operation2 operation2 = new Operation2();

		String subString = operation.getSubString(0, 200);
		System.out.println(subString);
		System.out.println();
		
		
		operation.divideByZero();
		
		System.out.println();
		String newString=operation2.getSubString(0, 50);
		System.out.println(newString);
	}
}
