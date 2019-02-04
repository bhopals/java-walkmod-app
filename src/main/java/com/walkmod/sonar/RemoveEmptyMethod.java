package com.walkmod.sonar;

public class RemoveEmptyMethod {

	
	private void removeEmptyMethod1() {
	
	
	
	
	}

	private static void bar(String a, String b, boolean c, boolean d) {
		System.out.println(a);
		System.out.println(b);
	}

	
	private void removeEmptyMethod2() {
	
	
	
	
	}
	
	public static void main(String[] args) {
		bar("","",true,false);
	}
}
