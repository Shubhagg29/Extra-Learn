package abstraction;

public class Civic extends Car {

	
	
	 
	@Override
	public void accelerate() {
		System.out.println( name + " is Accelerating");
		System.out.println( ram + " is Accelerating");
		
	}

	@Override
	public void Breaking() {
		System.out.println("Car is tested for Breaking");
		
	}
	
	public void Speed() {
		System.out.println("Car is tested for Speeding");
	}

	@Override
	protected void chase() {
		// TODO Auto-generated method stub
		
	}

}
