package com.tka.throwExample;

public class Operation {
	String str = "TheKiranAcademy";

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
}
