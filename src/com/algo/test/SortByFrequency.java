/**
 * 
 * Sort elements by frequency (using Java Map)
 * 
 * Given an integer array, sort the array according to the frequency of elements in decreasing order, 
 * if frequency of two elements are same then sort in increasing order
 * 
 */

package com.algo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByFrequency {

	public static void main(String[] args) {

		int[] array = { 4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5 };
		List<Integer> outputArray = new ArrayList<>();
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num : array){
			int count = map.getOrDefault(num, 0);
			map.put(num, count + 1);
			outputArray.add(num);
		}
		
		SortComparator sortComparator = new SortComparator(map);
		Collections.sort(outputArray, sortComparator);

		System.out.println(outputArray);
		
	}
}

class SortComparator implements Comparator<Integer>{

	private final Map<Integer, Integer> freqMap;
	
	public SortComparator(Map<Integer, Integer> _freqMap) {
		this.freqMap = _freqMap;
	}

	@Override
	public int compare(Integer k1, Integer k2) {
		
		int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1));
		int valueCompare = k1.compareTo(k2);
		
		if(freqCompare == 0){
			// compare by value
			return valueCompare;
		}else{
			return freqCompare;
		}
		
	}
	
}