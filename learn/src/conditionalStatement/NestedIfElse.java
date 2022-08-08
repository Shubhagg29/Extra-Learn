package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {

		int a = 12, b = 18, c = 15;
		int result = 0;

		if (a > b) {
			if (a > c) {
				result = a;
             
			} else {
				result = c;

			}
		}

		else {
			if (b > c) {
				result = b;
			} else {
				result = c;
			}

		}

		System.out.println("The alrgest number is " + result);
	}

}
