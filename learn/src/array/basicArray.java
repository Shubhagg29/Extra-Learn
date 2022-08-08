package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class basicArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the subject number");

		int n = sc.nextInt();
		int[] marks = new int[n];
//		marks[0]=10;
//		marks[1]=20;
//		marks[2]=70;
//		marks[3]=60;
//		marks[4]=40;

		System.out.println("Enter the marks ::");
		for (int i = 0; i < n; i++) {

			marks[i] = sc.nextInt();

		}

		for (int am : marks) {
			System.out.println("Enter array" + am);
		}
		arrayCheck();
	}
public static void arrayCheck() {
	Integer[] numbers =  { 1, 2, 3 };
	List<Integer> list = Arrays.asList(numbers);
	
	System.out.println(list);
}

}
