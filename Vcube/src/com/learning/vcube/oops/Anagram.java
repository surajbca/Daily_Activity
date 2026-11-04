package com.learning.vcube.oops;

import java.util.ArrayList;

public class Anagram {
	
	public static void main(String[] args) {
		
		String s1 = "listen";
		String s2 = "silent";
		
		ArrayList<Character>list = new ArrayList<>();
		
		if(s1.length() != s2.length()) {
			System.out.println("Not Anagrams");
			return;
		}
		
		for(int i = 0; i < s1.length(); i++) {
			list.add(s1.charAt(i));
		}
		
		for(int i = 0; i < s2.length(); i++) {
			
			char ch = s2.charAt(i);
			
			if(list.contains(ch)) {
				list.remove(Character.valueOf(ch));
			} else {
				System.out.println("Not Anagrams");
				return ;
			}
		}
		
		if(list.isEmpty()) {
			System.out.println("Both Strings are Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}
	}

}
