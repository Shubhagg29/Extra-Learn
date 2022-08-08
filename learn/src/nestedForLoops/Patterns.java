package nestedForLoops;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {

		star();
		//reverseStar();
   //  reverseStar2();
	 //  starTree();
	}

	public static void star() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void reverseStar() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= n - i + 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void reverseStar2() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("* ");
			}
			

			System.out.println();
		}
	}
	
	public static void starTree() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
