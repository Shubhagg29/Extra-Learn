package array;

import java.util.Arrays;

public class checkdouble {

	public static void main(String[] args) {
		String input ="Hindustani";
		String rev="";
		int len =input.length();
		for(int i=len-1;i>=0;i--) {
			if(input.charAt(i)!='t') {
				rev =rev + input.charAt(i);
			}
		}
	
		System.out.println(rev);
}
}