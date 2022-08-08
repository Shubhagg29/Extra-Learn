package loops;

import java.util.Scanner;

public class BreakAndContinue {

	public static void main(String[] args) {

		continueExample();
	}

	public static void breakExample() {

		Scanner sc = new Scanner(System.in);

		for (int i = 0;; i++) {

			int num = sc.nextInt();
			if (num < 0) {
				break;
			}
			System.out.println(num);
		}
	}

	public static void continueExample() {

		for (int i = 1; i <= 50; i++) {

			if (i %5==0)
				continue;
			System.out.print(" " + i);
		}
	}
}
