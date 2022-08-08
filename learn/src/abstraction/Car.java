package abstraction;

public abstract class Car {
	
	
	
	
	 public  String name ;
	 protected String ram;
	 private String ma;
	public abstract void accelerate();

	
	public abstract  void Breaking();
	
	public  void speed() {
		System.out.println("Speeding");
	}
	protected  abstract void chase();
}
