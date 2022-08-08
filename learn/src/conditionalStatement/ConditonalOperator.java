package conditionalStatement;

public class ConditonalOperator {

	public static void main(String[] args) {

		int age = 29;
		 int person =29;

		 age=person;
		if (age>=18 && age<=27) {

			System.out.println("Eligible for Engineering");
		} else if (age>= 18 && age <= 40) {

			System.out.println(" Eligible for Election ");
		} else {
			System.out.println("  Not Eligible for anything ");
		}

	}

	
}
