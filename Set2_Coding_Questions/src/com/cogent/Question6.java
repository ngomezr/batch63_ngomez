/**
 * 
 */
package com.cogent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Norberto Gomez
 * @date: Nov 22, 2022
 *	
 * 
 */
public class Question6 {
	/*
	 * TODO:
	 * 6. How to sort HashMap by using values?
	 */
	
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>(); 
        LinkedHashMap<String, String> sortedMap = new LinkedHashMap<>();
        ArrayList<String> list = new ArrayList<>();
        map.put("2", "B");
        map.put("8", "A");
        map.put("4", "D");
        map.put("7", "F");
        map.put("6", "W");
        map.put("19", "J");
        map.put("1", "Z");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        // If it was a <String, Integer> then we would just use regualr Collections.sort()
        Collections.sort(list, new Comparator<String>() {
        	// Anonymous class
            public int compare(String str, String str1) {
                return (str).compareTo(str1);
            }
        });
        
        for (String str : list) {
            for (Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue().equals(str)) {
                    sortedMap.put(entry.getKey(), str);
                }
            }
        }
        System.out.println(sortedMap);
	}
	
}
