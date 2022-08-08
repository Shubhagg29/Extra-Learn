package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecondLargestNUmber {

	static {
		System.out.println("Hello User");

	}

	public static void main(String[] args) {

		int a[] = { 3, 6, 1, 8, 9, 10, 17, 17, 13 };
		int max1 = 0;

	Arrays.sort(a);

		int as = a.length;
		//System.out.println(a[as-2]);
	for (int i=as-1; i>0; i--) 
		{
			if (a[i]!= a[as-1]) {
				System.out.printf("The second largest " + "element is %d\n", a[i]);
				break;
			}
		}

//		for (int nu : a) {
//			if(max1 < nu) {
//				max1=nu;	
//				
//			}
//			
//		}
//		int max2=0;
//		
//		for (int nu : a) {
//			if(max2 < nu && nu< max1) {
//				max2=nu;
//			}
//			
//	}
//		System.out.println("The second largest \" + \"element is %d\\n\"," + max2);
//
//	}
	
	
	}
}