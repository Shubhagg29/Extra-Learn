package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ArrayListDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String>fruits =new LinkedList<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Apple");
		fruits.add("banana");
		
		
    Set<String> set = new HashSet<String>();
    Set<String> dset = new HashSet<String>();
    for (String s: fruits) {
    	if(set.add(s)==false) {
    		dset.add(s);
    	}
    }
    System.out.println(dset);
    duplicateCharacter();
	}
	
	
	public static void duplicateCharacter() {
		
		List<Character> input= new ArrayList<Character>();
		
		List<Character> duplicate= new ArrayList<Character>();
		
		 Set<Character> set = new HashSet<Character>();
		input.add('a');
		input.add('b');
		input.add('c');
		input.add('d');
		input.add('e');
		input.add('a');
		input.add('e');
		
		 System.out.println(input);
		
		for(Character ar:input) {
			if(set.add(ar)== false) {
				duplicate.add(ar);
			}
			
		}
		
		 System.out.println(duplicate);
		
		
		
	}

	}
