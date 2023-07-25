package day16_Java_Collections_Framework;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {


		ArrayList<String> b = new ArrayList<String>();
		
		b.add("name");
		b.add("address");
		b.add("lastName");
		b.add("city");
		
		Collections.sort(b);

		System.out.println(b);
		
	}

}
