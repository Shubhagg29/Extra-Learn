package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class DuplicateMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> map = new HashMap<String,String>();
		 Set<String> set = new HashSet<String>();
		 Set<String> dset = new HashSet<String>();
		map.put("1", "abc");
		map.put("2", "ac");
		map.put("4", "bc");
		map.put("5", "abc");
		
		System.out.println(map);
		
		for(Map.Entry<String, String> mp: map.entrySet()) {
			
		if(set.add(mp.getValue())==false) {
			
			dset.add(mp.getValue());
			
			//System.out.println("abc");
		}
		

		
		}
		System.out.println(set);
		System.out.println(dset);
		
//		
//		Map<Integer,String> st = new HashMap<Integer,String>();	
//		
//		st.put(1, "abc");
//		st.put(2, "ac");
//		st.put(4, "bc");
//		st.put(5, "abc");
//		for(Map.Entry<Integer, String> sat: st.entrySet()) {	
//			
//	int count = Collections.frequency(new ArrayList(sat.getKey()), "abc")	;
//		
//	System.out.println();
		}
		
	
	}
	     
