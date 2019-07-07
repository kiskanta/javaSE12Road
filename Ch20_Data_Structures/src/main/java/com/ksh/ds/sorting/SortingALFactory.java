package com.ksh.ds.sorting;

/**
 * 
 * @author Kingshore
 *
 */
public interface SortingALFactory {
	/**
	 * <b>Bubble Sort : </b> is the simplest way of sorting the array. It works by
	 * iterating the input array from the first element to last comparing each pair
	 * of elements and swapping them if needed. It contains its iterations until no
	 * more swaps are needed. <b>Insertion Sort</b> has better performance then
	 * bubble sort. We should not use Bubble sort because of its Simplicity and
	 * complexity.
	 * 
	 * @param array non sorted array
	 * @return sorted Array
	 */
	int[] bubbleSort(int[] array);

	/**
	 * Improving the bubble Sort by a flag. If no more flag indicate the completion
	 * of sorting.. If the array is already sorted, we can use this flag to skip the
	 * remaining passes.
	 * 
	 * @param array non sorted array
	 * @return sorted Array
	 */
	int[] bubbleSortByFlag(int[] array);

	/**
	 * <b>Selection Sort : </b> is in a place sorting algorithm. It is used for
	 * sorting the files with very large values and small keys. This is because
	 * selection is made on keys and swaps are made only when require.<br/>
	 * 
	 * 1. Find the minimum value in the list.</br>
	 * 2. Swap it with value in the current position.<br/>
	 * 3. 
	 * @param array
	 * @return
	 */
	int[] selectionSort(int[] array);

	int[] insertionSort(int[] array);

	int[] shellSort(int[] array);

	int[] mergeSort(int[] array);

	int[] heapSort(int[] array);

	int[] quickSort(int[] array);

	int[] treeSort(int[] array);
}
