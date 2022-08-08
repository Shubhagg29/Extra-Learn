package nestedForLoops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		int temp = number;
		int reversedNumber = 0;
		int Sum = 0;
		while (temp > 0) {

			int lastDigit = temp % 10;

			reversedNumber = reversedNumber * 10 + lastDigit;

			temp = temp / 10;

			// * To find the sum of enterd Digits*//
			//int lastDigit = temp % 10;
			// temp= temp/10;
			// Sum =Sum +lastDigit;

		}
		// System.out.println("Entered number is palindrome " + Sum);
		if (number == reversedNumber) {
			System.out.println("Entered number is palindrome  " + number);
		} else {
			System.out.println("Entered number is not  palindrome  " + number);
		}

	}

}
