package string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reverseString();
		reverseStringByWord();
		reverseString();
	}

	public static void reverseString() {
		String input="Shubham";
		String rev="";
		for(int i=input.length()-1;i>=0;i--) {
			rev = rev + input.charAt(i);
		}
		System.out.println(rev);
	}


	public static void reverseStringByWord() {

		String input = "learning is continous";
		String reversed = "";

		String word[] = input.split("\\s");

		int length = word.length - 1;
		
		for (int i = length; i >= 0; i--) {

			reversed = reversed + word[i] + " ";

		}
      
		System.out.println(reversed);

		

	}
}
