package inherritance;

public class Teacher extends Person {
	
	
	public void teach() {
		System.out.println("Teacher is Teaching !!");
	}
	
	
	public void eat() {
		
		super.eat();
		System.out.println("Teacher is Eating !!");
	}
	

}
