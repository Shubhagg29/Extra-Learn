package loops;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to calculate power::");
		int a= sc.nextInt();
		
		System.out.print("Enter power::");
		int b= sc.nextInt();
		int result =1;
		
		for(int i=0;i<b;i++)
		{
			result *=a;
			//result = result *a;
			
		}
		System.out.print("" +result);
	}
	

}
