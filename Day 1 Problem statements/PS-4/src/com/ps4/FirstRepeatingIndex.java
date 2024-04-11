package com.ps4;

import java.util.*;

public class FirstRepeatingIndex {
  
	    public static int findFirstRepeatingIndex(int[] arr) {
	        HashMap<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < arr.length; i++) {
	            int num = arr[i];
	            if (map.containsKey(num)) {
	                return map.get(num); // Return the index of the first occurrence
	            } else {
	                map.put(num, i); // Store the index of the element
	            }
	        }
	        return -1; // If no repeating element found
	    }

	    public static void main(String[] args) {
	        int[] arr = {10, 5, 3, 4, 5, 3, 6};
	        int repeatingIndex = findFirstRepeatingIndex(arr);
	        if (repeatingIndex != -1) {
	            System.out.println("Index of the first repeating number: " + repeatingIndex);
	        } else {
	            System.out.println("No repeating number found.");
	        }
	    }
	}
