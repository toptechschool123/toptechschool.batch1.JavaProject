package day16_Java_Collections_Framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Class {

	public static void main(String[] args) {


		// insertion order preserverd
		// implemement list interface
		// stores all data types
		// duplicates are allowed
		// ctrl+shift+o = to import packages
		
		ArrayList a = new ArrayList();
		
		a.add("empName");
		a.add(20.2);
		a.add('A');
		a.add(20);
		a.add(true);
		a.add('A');
		
		System.out.println(a);
		System.out.println(a.get(0));
		System.out.println(a.size());
		
		
		
		
		ArrayList<Integer> c = new ArrayList<Integer>();
		
		
		c.add(20);
		c.add(30);
		
		List d = new ArrayList();
		
		d.add("name");
		d.add(100);
		System.out.println(d);
		
		// get();
		System.out.println(c.get(0));
		System.out.println(c.get(1));
		
		//size();
		
		System.out.println(c.size());
		
		//set(); -- update
		
		d.set(0, "lastName");
		System.out.println(d);
		
		// remove();
		System.out.println(d.remove(0));
		
		// array is static
		// arraylist is dynamic/ resizable
		
		int [] v = { 10, 20, 30,40, 50, 60 };
		
		int [] x = new int [3];
		
		x[0]= 10;
		x[1] = 20;
		x[2] = 30;
		
		
		System.out.println(x[2]);
		
		
		
		System.out.println(v.length);
	
		
		// clear();
		c.clear();
		System.out.println(c);
		
		
		
		ArrayList<String> b = new ArrayList<String>();
		
		b.add("name");
		b.add("address");
		b.add("lastName");
		b.add("city");
	
		for(int i = 0; i<b.size(); i++) {
			System.out.println(b.get(i));
		}
		
		for(String  m : b) {
			System.out.println(m);
		}
		
	}

}
