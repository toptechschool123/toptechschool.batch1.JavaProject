package day1_basics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaBasics {

	public static void main(String[] args) {
		
		Set a = new HashSet();
		a.add("name");
		a.add("age");
		
		//System.out.println(a);
		
		for (int i=0; i<0; i++) {
			System.out.println(i);
			
			
		}
		
		  for(Object e :a) { System.out.println(e); }
		  
		  
		  
		  Map x = new HashMap();
		  
		  x.put("name",  "sayed");
		  x.put("class","sdet");
		  x.put("wage", "300");
		  
		  x.keySet();
		  x.values();
		//  x.containsKey("name ********");
		//  System.out.println(x);
		//  System.out.println(x.keySet() + " " + x.values());
		//  System.out.println(x.keySet());
		//  System.out.println(x.values());
		  
		  
		  for (Object i: x.keySet()) {
			  System.out.println(i + "   " + x.get(i));
			  
		  }
		//  For (Object i: m.keySet(){
			  
		  }

		/*
		 * System.out.println("hello all ");
		 * 
		 * System.out.println(9 + 9);
		 * 
		 * System.out.println("9+9");
		 * 
		 * System.out.println("hello all ");
		 * 
		 * 
		 * 
		 * 
		 * System.out.println(9 + 9);
		 * 
		 * System.out.println("9+9"); System.out.println("hello all ");
		 * 
		 * System.out.println(9 + 9);
		 * 
		 * System.out.println("9+9");
		 * 
		 * // System.out.println("hello all ");
		 * 
		 * System.out.println(9 + 9);
		 * 
		 * System.out.println("9+9");
		 */
	}


