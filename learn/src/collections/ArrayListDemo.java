package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("Onestyle "+list);
		for(Integer e:list) {
		System.out.println(e);
		}

		//Using Lambda Function
		
		list.forEach(e->{
			System.out.println("lambda:: "+ e)  ;
		});
		
		list.stream().forEach(f->{
			System.out.println("lambda steam:: "+ f)  ;
		});
		
		//Creating ArrayList with Another ArrayList
		ArrayList<Integer> number= new ArrayList<Integer>(Arrays.asList(10,40,50));
		System.out.println("lambda steam:: "+ number)  ;
	}

	//Using Stream with Lambda Function
	
	

}
