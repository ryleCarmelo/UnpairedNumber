package com.ripeconcepts;

import java.util.HashMap;

public class UnpairedNumber {

	public static void main(String[] args) {
		int numArray[] = {9, 3, 9, 3, 9, 7, 9};
		
		System.out.println(solution(numArray));

	}
	
	 public static int solution(int[] A) {
		 
		 HashMap<Integer, Integer> checkedNumbers = new HashMap<>();
		 
		 for (int numberFromArray : A) {
			 checkedNumbers.put(numberFromArray, checkedNumbers.getOrDefault(numberFromArray, 0) + 1);
		 }
		 int unpairedNumber = 0;
		 for (int numberFromArray : A) {
			 if(checkedNumbers.get(numberFromArray) == 1) {
				 unpairedNumber = numberFromArray;
			 }
		 }
		 return unpairedNumber;
	 }

}
