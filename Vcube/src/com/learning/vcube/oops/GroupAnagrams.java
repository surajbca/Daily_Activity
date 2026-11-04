package com.learning.vcube.oops;

import java.util.*;

public class GroupAnagrams {
	
	public static void main(String[] args) {
		
		String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		Map<String, ArrayList<String>> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			
			char[] ch = arr[i].toCharArray();
			
			Arrays.sort(ch);
			
			String key = new String(ch);
			
			if(map.containsKey(key)) {
				
				map.get(key).add(arr[i]);
				
			} else {
				
				ArrayList<String> list= new ArrayList<>();
				list.add(arr[i]);
				
				map.put(key, list);
			}
		}
		
		System.out.println(map.values());
	}

}
