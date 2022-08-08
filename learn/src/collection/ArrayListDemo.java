package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String>fruits =new LinkedList<>();
		List<String>vegetables =new LinkedList<>();
		List<String>remove =new LinkedList<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Kiwi");
		fruits.add("banana");
		
	
	
		
		System.out.println(fruits);
		vegetables.add("Orange");
		vegetables.add("Apple");
		vegetables.add("banana");
		vegetables.add("Kiwi");
		
		
		
		
		
		Collections.sort(fruits);
		Collections.sort(vegetables);
//System.out.println(fruits.equals(vegetables));

	
		remove.add("banana");
		remove.add("Chili");
		remove.add("Onion");
		
		fruits.addAll(vegetables);
		//System.out.println(fruits);
		fruits.removeAll(remove);
		
	
		
		
		
	Object [] temp=	fruits.toArray();
	
	for(Object a : temp) {
		//System.out.println();
	}
		
	}

}
