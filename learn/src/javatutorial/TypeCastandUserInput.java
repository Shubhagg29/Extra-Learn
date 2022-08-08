package javatutorial;

import java.util.Scanner;

public class TypeCastandUserInput {

	public static void main(String[] args) {

		double x = 10;
		float y = (float) x;
		
		String txt="hello";
		
		
		double my_double=10.345;
		int Z = (int) my_double;

		System.out.println(y + " " + Z);
		simpleIntrest();
	}

	public static void simpleIntrest() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Principal Amount::");
		int principal = sc.nextInt();

		System.out.println("Enter Rate of interest");
		float rate = sc.nextFloat();

		System.out.println("Enter Time");
		int time = sc.nextInt();

		float SI = principal * rate * time/  100;

		System.out.println("Simple Interest is ::" + SI);
	}

}
