package collection;

import java.util.HashMap;
import java.util.Map;

public class oneMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();  
		map.put("Aman", 19);  
		map.put("Sachin", 29);  
		map.put("Ritesh", 39);  

		
		for(Map.Entry<String, Integer> e:map.entrySet() ) {
			System.out.println(e.getKey()+ " " +  e.getValue());
		}
	}

}
