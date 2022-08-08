package array;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeArray {

	public static void main(String[] args) {
//		int[][] arr = { {2,4,6}, {1,3,5}};
//		  
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j<arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//  
//            System.out.println();
//        }
		
		 Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter rows and cols:  ");
		int rows= sc.nextInt();
		int cols= sc.nextInt();
		int a[][]=new int[rows][cols];
		
		System.out.println("Enter array a:  ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				a[i][j]= sc.nextInt();
				
				  //System.out.print(a[i][j] + " ");
			}
			
			 
		
    }
		 for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j<a[i].length; j++) {
            System.out.print(a[i][j] + " ");
         }
	  
	            System.out.println();
		}
		
		
	}
	
	
}		
	

