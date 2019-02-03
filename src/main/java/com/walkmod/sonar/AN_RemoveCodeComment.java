package com.walkmod.sonar;

public class AN_RemoveCodeComment {

	private void removeCommentedCode() {
		
		
		for(int i=0; i < 45; i++){
			
			//i = i++;
			System.out.println("Print:"+i);
			
			int j = i+1;
			System.out.println("J::"+j);
		}
	}
	
	private void bar(){
		String a="a", b = "b", c = "c";
		/*System.out.println(a+a+c);
		System.out.println(a+c+c);
		System.out.println(a+a+b);
		
		System.out.println(a+b+c);
		*/
		
		/*for(int i =0 ; i<3;i++){
			System.out.println(i);
		}*/
		
		System.out.println(a+b+c);
		
	}
}
