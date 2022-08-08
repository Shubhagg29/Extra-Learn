package qa.testcases;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Interview {

	public static void main(String[] args) {
		
		int n=123456;
		 
		
		int sum =0;
		
		while(n>0) {
			
			int lastDigit= n%10;
			if(lastDigit%2==0) {
			
			
			sum = sum +lastDigit;
		}
			n= n/10;
			
	    
	 
	}	 
		System.out.println(sum);
	}		
}
	
	
