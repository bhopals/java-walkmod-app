package com.walkmod.sonar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayDesignatorOnType {

	private static void arrayListTest() {

		ArrayList<String> samples = new ArrayList<String>();
		samples.add("TEST1");
		samples.add("TEST2");
		samples.add("TEST3");
		samples.add("TEST4");
		System.out.println(samples);

	}
	
	public static void main(String[] args) {
		arrayListTest();
	}
}
