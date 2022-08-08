package collection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GenericDemo <String, Integer>d1= new GenericDemo<String, Integer>("Shubham", 48);
		GenericDemo <Boolean, String>d2= new GenericDemo<Boolean, String>(true, "Ram");
		
		
		d1.getDescription();
	}

}
