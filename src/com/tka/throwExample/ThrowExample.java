package com.tka.throwExample;

 public class ThrowExample {

	public static void main(String[] args) {
		Operation operation = new Operation();

		String subString = operation.getSubString(0, 200);
		System.out.println(subString);
		System.out.println();

	}

}
