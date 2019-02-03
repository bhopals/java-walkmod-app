package com.walkmod.sonar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class N_DeclarationsShouldUseCollectionInterfaces {
	
	private void collectInterfaceTest(){
		
		List<String> str = new ArrayList<String>();
		System.out.println(str);
		
			List lt = new LinkedList<>();
		System.out.println(lt);
		
	}

}
