package abstraction;

public class RepairShop {
	
	

	public  static void repairCar(Car car) {
		System.out.println("car is repaired");
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		Civic civic = new Civic();
		civic.name="Honda Civic";
		civic.ram="bubloo";
		
		repairCar(civic);
		
		civic.accelerate();
		
	}

}
