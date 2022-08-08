package nestedForLoops;

public class NestForLoopExample {

	public static void main(String[] args) {

		
		for (int i=0;i<=5;i++) {
			
			for (int k = 1; k <= 5 - i+1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
    
	tables();
	}

	public static void tables() {

		for (int j = 1; j <= 10; j++) {
			for (int i = 1; i <= 10; i++) {
				System.out.print(j * i + " ");
			}
			System.out.println();
		}

	}

	
	
}
