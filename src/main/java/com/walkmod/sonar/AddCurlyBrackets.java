package com.walkmod.sonar;

public class AddCurlyBrackets {

	private void ifCurlyBracketsTest() {
		
		boolean isContinue = true;
		String result= "";
		
		if(isContinue)
			result = "SUCCESS";
		else 
			result = "FAIL";
		
		System.out.println("RESULT String is :"+result);
	
	}


	private void forCurlyBracketsTest() {
		
		boolean isContinue = true;
		String result= "";
		
		for(int i=0;i<4;i++)
			result = result+i;
				
		System.out.println("RESULT String is :"+result);
	
	}

}
