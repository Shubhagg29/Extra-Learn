package learn;

public class Child  extends Parent{
	
	
	public void swim() {
	   System.out.println("Everyone is swimming");
	}
	
	public void eat() {
		System.out.println("Pizza Eating  ");
	}
	
	
	public void drink() {
		System.out.println("Ramu Drink  ");
	}
	public static void main(String args[]) {
		
		Parent obj = new Child();
		
		obj.eat();
		obj.drink();
		
		Child obj1 = (Child) obj;
		obj1.swim();
		obj1.drink();
	}

}
