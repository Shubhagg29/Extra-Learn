package loops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Fizz {

	public static void main(String[] args) {
  int count =0;
 int count1=0;
		Map < String, Integer > map = new HashMap < > (); 
		  String input = "i love india one";
		  String word[]= input.split("\\s");
		 // for(int i=0;i<input.length()-1;i++) {
			//  if(input.charAt(i)==' ' && i<input.length()-1 && input.charAt(i+1)!=' ') {
		
		  
		  int length = word.length - 1;
	      
			for (int i = length; i >= 0; i--) {

				map.put(word[i], count++);
      
			}
			
			 System.out.println(map);
		  
		  for(Map.Entry<String, Integer>ma:map.entrySet()) {
			  
			 
	   count1 = Collections.frequency(new ArrayList<String>(ma.getValue()), "i");
			
			count1++;
			
			
		  }
		 
		  System.out.println(count1);
		 }
}
