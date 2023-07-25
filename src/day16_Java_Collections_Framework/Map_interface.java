package day16_Java_Collections_Framework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Map_interface {

	public static void main(String[] args) {
		/*
		 * Map interface is not child interface of Collection interface. Map interface
		 * is used to store objects in the form of Key & Value and implemented by the
		 * following classes
		 * 
		 * @HashMap
		 * 
		 * @LinkedHasMap
		 * 
		 * @HashTable   Insertion order is not preserved Duplicate keys not allowed
		 * Duplicate values allowed Null key allowed only once Null values allowed
		 * multiple
		 */

		HashMap<String, Comparable> m = new HashMap();

		m.put("namee", "Student");
		m.put("id", 1);
		m.put("gradee", " fourth");
		m.put("GPA Req", "3.0");
		
		System.out.println(m);
		
		
		
	
		
		
		
		
		HashMap <String, Integer > n = new HashMap();
		n.put("Pos", 1);
		
		HashMap <Integer, String > x = new HashMap();
		
		Map o = new HashMap();
		
		Map g =new  HashMap();
		
		//Map s = new Map();
		

		HashMap <String, String > h = new HashMap();
		
		h.put("name", "John");
		h.put("role", "1");
		h.put("grade", "A");
		h.put("Grade", "A");
		

		
		m.putAll(h);
		System.out.println(m);
		
		System.out.println(h.get("name"));
		System.out.println(h.get("grade"));
		
		System.out.println(h.remove("Grade"));
		
		System.out.println(h.containsKey("role"));
		System.out.println(h.containsValue("1"));
		
		System.out.println(h.size());
		System.out.println(h.keySet());
		System.out.println(h.values());
		
		
		
		System.out.println(h);
		
		System.out.println("******************************");
		
		for(Object i: h.keySet()) {
			System.out.println(i   +    " "   +   h.get(i));
		}
		
		
		Hashtable<Integer, String> s = new Hashtable();
		s.put(1, "student");
		s.put(2, "teacher");
		s.put(3, "manager");
		
		System.out.println(s);
		
		for(Object a : s.keySet()) {
			
			System.out.println(a   +   "  "   +   s.get(a));
		}
		
	}

}
