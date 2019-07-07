package com.ksh.test.ds.sort;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ksh.ds.sorting.KSHSortingAlgorithm;
import com.ksh.ds.sorting.SortingALFactory;

public class KSHSortALTest {
	private static SortingALFactory factory = null;
	private static KSHSortingAlgorithm sortAl = null;
	
	@BeforeAll
	public static void init(){
		factory = new KSHSortingAlgorithm();
		sortAl = new KSHSortingAlgorithm();
	}
	
	@Test
	public void sortingAlTest(){
		int array[] = {21, 1, 31, 51, 41, 91, 61, 32, 36, 93};
		
		int[] bubbleSort = factory.bubbleSort(array);
		int[] bubbleSortFlag = factory.bubbleSortByFlag(array);
		
		sortAl.printArray(bubbleSort);
		System.out.println();
		sortAl.printArray(bubbleSortFlag);
	}
}
