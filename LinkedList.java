package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class LinkedList {
	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("Canada");
		l.add("India");
		l.add("America");
		l.add("South Africa");
		
		for(Object o:l) {
			System.out.println(o);
		}
		
		
	}
}
