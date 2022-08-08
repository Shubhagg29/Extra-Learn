package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Test{
	
	
	public static void main (String args[]) {
//		String input="adam";
//		
//		String rev="";
//	int len=input.length();
//	
//	for(int i=len-1;i>=0;i--) {
//		
//		rev =rev+input.charAt(i);
//		
//	}
//	
//	if(rev.equalsIgnoreCase(input)) {
//		System.out.println("Yes");
//	}
//	else {
//		System.out.println("no");
//	}
		//reverseString();
		reverseStringCharacter();
	}
	
	//String Builder
	public static void reverseStringCharacter() {
		
		String ac="abc";
		System.out.println(Integer.parseInt(ac));
		StringBuilder build= new StringBuilder("Hindustani");
		StringBuilder newStrig=build.deleteCharAt(4);
		
	System.out.println(newStrig.reverse());
	
	
	
	
	}
	public static void reverseString () {
		String rev="";
		
		
		String input="adam working";
		
		StringBuilder c= new StringBuilder();
       StringBuilder Str=c.append(input);
       System.out.println(Str.reverse());
		String arr[]=input.split("\\s");
		int arr1= arr.length;
		
		for (int i=arr1-1;i>=0;i--) {
			
			rev = rev + arr[i];
			
		}
		System.out.println(rev);
		
	}
	
	
}