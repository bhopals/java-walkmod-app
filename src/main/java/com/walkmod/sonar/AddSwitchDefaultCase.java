package com.walkmod.sonar;

public class AddSwitchDefaultCase {

	private static void swithDefaultCaseTest() {

		String match = "B";

		switch (match) {

			case "A": {
				System.out.println("inside A");
				break;
			}
	
			case "B": {
				System.out.println("inside B");
				break;
			}
	
			case "C": {
				System.out.println("inside C");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		swithDefaultCaseTest();
	}
}

