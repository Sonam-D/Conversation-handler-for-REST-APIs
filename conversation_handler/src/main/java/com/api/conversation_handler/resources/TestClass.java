package com.api.conversation_handler.resources;

import java.io.FileNotFoundException;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Input i1= new Input("1","XML");//??
			
			Mapper.ReadFile();
	
			Output o1= Mapper.getPath(i1);
			System.out.println(o1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
