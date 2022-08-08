package string;

import java.util.Scanner;

public class Anagram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ::");

		String a = sc.next();

		System.out.println("Enter the string :: B");

		String b = sc.next();
		
		
		int al[]= new int [256];
		int bl[]= new int [256];
		boolean anagram = true;
		
        for(int i=0;i<a.length();i++) {
        int c=	a.charAt(i);
        
        al[c]++;
        }
		for (int i=0;i<b.length();i++) {
			int c =b.charAt(i);
			
			bl[c]++;
		}
		
		for (int i=0;i<256;i++) {
			if(al[i]!=bl[i]) {
				anagram=false;
				break;
			}
			
		}
		
		if((anagram)) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
	}

}
