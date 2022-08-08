package learn;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter new line ");
		String input = scan.nextLine();

		String reversed = "";
		String[] word = input.split("\\s");

		int len = word.length;

		for (int i = len - 1; i >= 0; i--) {

			reversed = reversed + word[i] + " ";

		}

		System.out.println(reversed);


		//reverseStringWord();

	}

	
	public static void reverseStringWord() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter new line ");
		String input = scan.nextLine();
		
		
	////Using String Builder
	
		StringBuilder build = new StringBuilder();
		StringBuilder Input1 = build.append(input);
		StringBuilder reversedString = Input1.reverse();
		System.out.println(reversedString);
				
			

	}
		
	}
