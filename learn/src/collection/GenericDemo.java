package collection;

public class GenericDemo<X,Y> {
	X x;
	Y y;
	
	public GenericDemo(X x, Y y) {
		
		this.x= x;
		this.y= y;
	}
	
	
	public void getDescription() {
		System.out.println(x +" " + y);
	}
}
