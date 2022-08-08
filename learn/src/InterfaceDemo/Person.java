package InterfaceDemo;

public class Person implements Student, Player {

	public static void main(String[] args) {
		

		Person person= new Person();
		person.study();
		person.footBaller();
				

	}

	@Override
	public void footBaller() {
		System.out.println("Person is Studying");
		
	}

	@Override
	public void study() {
		System.out.println("Person is Playing Football");
		
	}

	@Override
	public void UEFA() {
		System.out.println("Person is Playing Football in UEFA Cup");
		
	}

}
