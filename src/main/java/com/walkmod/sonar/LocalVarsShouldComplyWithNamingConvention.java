package com.walkmod.sonar;

import java.util.ArrayList;

public class LocalVarsShouldComplyWithNamingConvention {
	
	private static void localVaribleNamingTest(){
		
		String str_test = "TEST";
		Integer int_test = 5;
		Float float_test = 5.6f;

		ArrayList<String> al_list = new ArrayList<String>();
		al_list.add("TEST1");
		al_list.add("TEST2");
		
		System.out.println("List:"+al_list);
		System.out.println("VALUES:"+str_test+int_test+float_test);
	}

	public static void main(String[] args) {
		localVaribleNamingTest();
	}
}
