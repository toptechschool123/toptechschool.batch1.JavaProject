package day16_Java_Collections_Framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set_interface {

	public static void main(String[] args) {

		// List interface --- ArrayList and LinkedList
		
		
		// no insertion order
		// no duplicates allowed
		// any data types can be stored
		
		HashSet h = new HashSet();
		
		h.add("book");
		h.add("pen");
		h.add(10);
		h.add('A');
		
		System.out.println(h);
		LinkedHashSet l = new LinkedHashSet();
		
		l.add(200);
		l.add(400);
		l.add(600);
		l.add(2);
		System.out.println( l);
		
		Iterator it = h.iterator();
		// hasNext();
		// next();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	
		h.remove("book");
		System.out.println("book object was removed from the set " + h);
		
		
		HashSet n = new HashSet();
		n.add(10);
		n.add(20);
		n.add(30);
		
		HashSet m = new HashSet();
		m.add(100);
		m.add(200);
		m.add(300);
		
		n.addAll(m);
		System.out.println(n);
		
		n.remove(100);
		System.out.println(n);
		
		System.out.println(n.contains(300));
		
		for(Object v : n) {
			System.out.println(v);
		}
		
		
		Iterator i =n.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		

	}

}
