package com.walkmod.sonar;

import com.oracle.jrockit.*;

public class DeadCodeCleaner {

	
	  public static void goodBye(){
		 String test="May";
		 Integer b = 5+6;
		 testCode();
	    System.out.println("bye");
	  }
	  
	  public static String testCode() {
		  for(int i = 0 ; i <6;i++){
			  System.out.println(i);
		  }
		  String test="top";
		  
		  
		  return "testCpode";
	  }
	  
	  public static void main(String[] args) {
		  goodBye();
	}
}
