
package com.api.conversation_handler.resources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * TODO complete the class documentation
 *
 */
public class Mapper {

	
	public Mapper() {
		
		
	}
	
	
 static final HashMap<Input,Output> oracle = new   HashMap<Input,Output>();
  
  public static Output getPath(Input input) {
    Output output =  oracle.get(input);
    return output;
  }
  
  public static void ReadFile() throws FileNotFoundException{
	  File file = new File("C:\\Users\\Transitions.txt");
	  Scanner s = new Scanner(file);
	  ArrayList<String> Array_String=  new ArrayList<String>();//read from filr Transitions.txt store in Arraylist
	  while(s.hasNextLine()) {
		  String s1= s.nextLine();
		  Array_String.add(s1);
		  String[] result = s1.split(","); 
		  Input i = new Input(result[0],result[1]);
		  Output o= new Output(result[2],result[3]);
		  
		  put(i,o);
	  }
	  
//	  System.out.println(Array_String);
	  }



public static void put(Input input,Output output) {
    oracle.put(input,output);
  
}
  public Boolean hasNext(Input input) {
    Output output =  oracle.get(input);
    if(output==null)
      return false;
    
    return true;
    
  }
  
}
