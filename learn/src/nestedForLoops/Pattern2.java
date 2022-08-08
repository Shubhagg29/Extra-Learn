package nestedForLoops;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 numberPyramid();
		//starMix();

	}

	public static void numberPyramid() {
		int n = 5;
		int count = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("& ");

			}
			for (int k = 1; k <= i; k++) {

				System.out.print(count++ + " ");
			}

			System.out.println();
		}
	}

	public static void starMix() {

		int n = 4;
		int rows = 2 * n - 1;
		for (int i = 1; i <= rows; i++) {

			if (i <= n) {
				for (int j = 1; j <= i; j++) {
					System.out.print("* ");
				}
			} else {
				for (int j = 1; j <= rows - i + 1; j++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
