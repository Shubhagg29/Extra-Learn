package operators;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {

		incrementOperator();
		assignmentOPerator();
		EvenNumber();
	}

	public static void EvenNumber() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number ::");
		int number = scn.nextInt();
	   
		if (number %2 ==0){
			System.out.println("Entered number is even number");

		} else {
			System.out.println("Entered number is odd number");
		}
	}

	public static void incrementOperator() {

		int a = 10;
		int b = 20;
		int c = b++;
		int d = ++a;
		
		
		System.out.println(c + ":" + b + ":" + d + ":" + a);

	}

	public static void assignmentOPerator() {

		int a = 4;
		int c = a+=2;
		int d = c + 2;
		
		System.out.println(a + ":" + c + ":" + d);
		System.out.println(a > c);
		System.out.println(d != c);
	}
}
