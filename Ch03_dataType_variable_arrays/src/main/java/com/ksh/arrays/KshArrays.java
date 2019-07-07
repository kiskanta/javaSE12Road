package com.ksh.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class KshArrays extends AbstractArray {

	@Override
	public void printArrayForEach(int[] array) {
		for (int i : array) {
			System.out.print(i);
		}
	}

	@Override
	public void printArrayStream(int[] array) {
		IntStream intStream = Arrays.stream(array);
		intStream.forEach(System.out::print);
	}

	@Override
	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + " ");
		}
	}

	@Override
	public int arraySum(int[] array) {
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum;
	}

	@Override
	public int arrayLargestNumber(int[] array) {

		return 0;
	}

	@Override
	public int arraySmallestNumber(int[] array) {

		return 0;
	}
}
