package conditionalStatement;

public class SwtichCase {

	public static void main(String[] args) {
		int dayofWeek = 4;

		switch (dayofWeek) {

		case 1: {
			System.out.println("Day is Sunday");
		}
			break;
		case 2:
			System.out.println("Day is Monday");

			break;
		case 3:
			System.out.println("Day is Tuedsay");

			break;

		case 4:
			
		case 5:
			System.out.println("Day is Wednesday");

			break;
//		case 5: {
//			System.out.println("Day is Thursday");
//		}

		case 6:
			System.out.println("Day is Friday");

			break;

		case 7:
			System.out.println("Day is Saturday");

			break;

		default:

			System.out.println("Day is out of scope");

		}
	}

}
