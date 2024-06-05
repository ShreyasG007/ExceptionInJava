package com.tka.excpetionHandling;

public class Operation2 {
	String str = "TheKiranAcademy";

	public String getSubString(int start, int end) {
		String substring = null;

		try {
			substring = str.substring(start, end);
		} catch (NullPointerException e) {
			System.out.println("Exception Occured : Index out of bound");

		}
		return substring;

	}
}
