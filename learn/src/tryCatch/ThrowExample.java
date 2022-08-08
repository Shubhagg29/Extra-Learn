package tryCatch;

import java.util.ArrayList;
import java.util.List;

public class ThrowExample {
	
	private static List<Integer> integers = new ArrayList<Integer>();

	public static void main(String[] args) {
	    try {
	        addInteger(2);
	        addInteger(2);
	    }
	    catch(IllegalArgumentException e) {
	    	//e.printStackTrace();
	    	System.out.println(e.getMessage());
	    	
	    }
	    addInteger(2);
        addInteger(2);
	
	}
	
	
	public static void addInteger(Integer value) throws IllegalArgumentException {
	    if (integers.contains(value)) {
	        throw new IllegalArgumentException("Integer already added.");
	    }
	    integers.add(value);
	    System.out.println(integers);
	}

}
