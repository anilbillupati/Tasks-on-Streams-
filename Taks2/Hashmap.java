package com.Tasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HmapkeyRemovingTask {
	public static void main(String[] args) {
		
	
	Map<String,Integer> map= new HashMap<>();

	map.put("anil",23);
	map.put("Samar",43);
	map.put("Venkatesh",27);
	map.put("Pavan",12);
	map.put("Dinesh",36);
	map.put("Abdul",30);
	for(Entry<String, Integer> names: map.entrySet()) {
		System.out.print(names.getKey()+names.getValue()+" ");
		
	}
	
	map.remove("anil");
	
	System.out.println();
	for(Entry<String, Integer> names: map.entrySet()) {
		System.out.print(names.getKey()+names.getValue()+" ");
		
	}

	}

}
