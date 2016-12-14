package com.jcf.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<String, String> hashMap = new HashMap<String, String>();
		
		hashMap.put("0", "zero");
		hashMap.put("1", "one");
		hashMap.put("2", "two");
		
		hashMap.remove("1");
		
		hashMap.put("3","tree");
		
		for (String key: hashMap.keySet())

		    System.out.println(hashMap.get(key));
		
		for (Map.Entry<String, String> entry: hashMap.entrySet())

		    System.out.println(entry.getKey() + " = " + entry.getValue());
	}
}
