package loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to find::");
		int n = sc.nextInt();
		boolean flag = true;
		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				flag = false;
				break;
			}
		}

		if (!(n < 2) && flag) {
			System.out.println(n + ": number is prime");
		} else {
			System.out.println(n + ": number is  not prime");
		}
	}
}
