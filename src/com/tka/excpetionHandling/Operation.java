package com.tka.excpetionHandling;

public class Operation {
	String str = "TheKiranAcademy";
	private int res;

	public String getSubString(int start, int end) {
		String substring = null;

		try {
			substring = str.substring(start, end);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Exception Occured : Index out of bound");
		} finally {
			System.out.println("Always Executed");
		}
		return substring;
	}

	public void divideByZero() {
		int a = 10;
		try {
			res = a / 0;
		} catch (ArithmeticException ae) {
			System.out.println("Exception Occured : Cant be divide by zero"+ res);
		} finally {
			System.out.println("Finally block");
		}

	}
}
