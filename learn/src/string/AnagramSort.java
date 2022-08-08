package string;

import java.util.Arrays;

public class AnagramSort {

	public static void main(String[] args) {
		

		String a = "listen";
		String b = "silent";
		
		boolean result = false;

	char [] ar=	a.toCharArray();
	char [] br=	b.toCharArray();
	
	Arrays.sort(ar);
	Arrays.sort(br);

	result =Arrays.equals(ar, br);
	
	if((result)) {
        System.out.println(a + " and " + b + " are anagram.");
      }
      else {
        System.out.println(a + " and " + b + " are not anagram.");
      }
	
	
    }
	

}
