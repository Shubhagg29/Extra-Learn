package string;
public class Test2{
	
	
	public static void main (String args[]) {
		reverseStringCharacter();
	}
	
	
	public static void reverseStringCharacter() {
		String input ="Shubham@321Gupta ";
		
		input.toCharArray();
		String word[]=input.split("@");
		
		String ar =word[0];
		String br =word[1];
		String ar1= "";
		String br1= "";
		String reverse= "";
		
		for(int i=ar.length()-1;i>=0;i--) {
			ar1= ar1 +ar.charAt(i);
		} System.out.println(ar1);
		
		for(int i=br.length()-1;i>=0;i--) {
		br1= br1 +br.charAt(i);
		}
		
		reverse= ar1 + " @"+ br1;	
	System.out.println(reverse);
	
	}
	
	
	
}