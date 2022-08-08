package loops;

import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {

		// Print even Number //(i=i+2)
//		for (int i = 0; i <= 20; i += 2) {
//			System.out.println(i);
//		}
		//Table of Number
		for(int i=1;i<=10;i+=1) {
			System.out.println("Table of 4 is :" + 4*i);
		}
		//printReverseNumber();
	//	Factorial();
		sumOfNumber();
	} 

	public static void sumOfNumber() {
		int sum = 0;
		int n = 5;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;

		}
		System.out.println("Sum fo 5 numbers ::" + sum);
	}

	public static void Factorial() {
		// **Factorial Program**//
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to calulate Fatorial");
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {

			fact = fact * i;
			System.out.println("Factorial fo 5 numbers ::" + fact);
		}
		
	}

	public static void printReverseNumber() 
	{
		for (int i =10; i > 0; i=i-1) {
			System.out.println("Reverse number:"+i);
		}

	}

}
