package conditionalStatement;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number");
		int a = sc.nextInt();

		System.out.println("Enter the Second number");
		int b = sc.nextInt();

		System.out.println("Enter the Operartion ");
		sc.nextLine();
		//char operation = sc.nextLine().charAt(0);
		 String operation = sc.nextLine();
		int result = 0;

		switch (operation) {

		case "Add": 
			result = a + b;

			break;
		

		case "sub": 
			result = a - b;
			break;
		
		case "mul": 
			result = a * b;
			break;
		

		case "div": 
			result = a / b;
			break;
		

		default:
			System.out.println("Entered operation is invalid");
		}
		System.out.println("The Result of " + operation + ":" + result);

	}

}
