package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm sortAlgorithm;// Autowiring by Type 

	
	/*Setter Injection
	 * public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}*/

	/*Constructor Injection ---> best one 
	 * public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}*/

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		// Implement Sorting Logic
		// Bubble Sort Algorithm
		/*
		 * BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm(); int[]
		 * sortedNumber = bubbleSortAlgorithm.sort(numbers);
		 */
		int[] sortedNumber = sortAlgorithm.sort(numbers);
		// Search array
		System.out.println(sortAlgorithm);
		return 3;// Return the result
	}
}
