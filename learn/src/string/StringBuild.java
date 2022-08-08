package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringBuild{
	
	
	public static void main (String args[]) {
		reverseStringCharacter();
		reverseStringCharacter2();
	}
	
	
	public static void reverseStringCharacter() {
		
		
		String input = "this is 12 shubham";
		
		List<Character> list = new ArrayList<Character>();
     for(char c: input.toCharArray()) {
//    	if(!(Character.valueOf(c).equals('u'))) {
//    		list.add(c);
//    	}
    	if(!(Character.isDigit(c))) {
    		list.add(c);
    	}
    	
     
     }
     System.out.println(list);
     Collections.reverse(list);
     System.out.println(list);
     StringBuilder build = new StringBuilder();
    for(Character c:list) {
    	 build.append(c);
    }
 String rev=   build.toString();
    
 System.out.println(rev);
	}
	
	
	public static void reverseStringCharacter2() {
		String input ="hindustani";
		String abc="";
		for(int i=input.length()-1;i>=0;i--) {
			if(input.charAt(i)!='u') {
				abc =abc +input.charAt(i);
			}
		}
		System.out.println(abc);
}
}