package com.ksh.ds.sorting;

public abstract class AbstractSortingAlgorithm implements LinearSortAl, TopologicalSort, SortingALFactory{
	@Override
	public int[] bubbleSort(int[] array) {
		int size = array.length;
		
		for(int outer = size-1; outer>=0; outer--) {
			for(int inner =0; inner<= outer-1; inner++) {
				if(array[inner] > array[inner+1]) {
					int temp = array[inner];
					array[inner] = array[inner+1];
					array[inner+1] = temp;
				}
			}
		}
		return array;
	}//end of BubbleSort
	
	@Override
	public int[] bubbleSortByFlag(int[] array) {
		int swaped=1; 
		for(int passes = array.length-1; passes >=0 && swaped==1; passes--) {
			swaped =0;
			for(int i=0; i<= passes-1; i++) {
				if(array[i] > array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}
		return array;
	}
	
	@Override
	public int[] selectionSort(int[] array) {
		
		return null;
	}
	
	public void printArray(int[] array){
		for(int num: array) {
			System.out.print(num+" ");
		}
	}
}
