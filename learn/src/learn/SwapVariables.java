package learn;

public class SwapVariables {

	public static void main(String[] args) {
	
		int x= 10;
		int y=13;
		
		
		x= x+y;
		y=x-y;
		System.out.println(x);
		System.out.println(y);
		
		x = x - y;
		
		System.out.println("Final value x " +x + "Final Value y  " + y);
		// TODO Auto-generated method stub

	}

}
