/**
 * Binary Search program
 */

package com.algo;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = { 44,78,99,100,105,298};
		int searchValue = 78;
		
		int start = 0;
		int end = array.length - 1;
		int middle = (start + end)/2;
		
		while(start <= end){
			if(array[middle] > searchValue){
				end = middle - 1;
			}else if(array[middle] == searchValue){
				System.out.println(String.format("element (%d) found at index (%d)", searchValue, middle));
				break;
			}else{
				start = middle + 1;
			}
			middle = (start + end)/2;
		}
		if(start > end){
			System.out.println(String.format("element (%d) not found", searchValue));
		}
	}

}
