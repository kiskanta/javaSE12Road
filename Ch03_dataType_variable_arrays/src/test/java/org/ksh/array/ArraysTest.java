package org.ksh.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ksh.arrays.AbstractArray;
import com.ksh.arrays.ArraysFactory;
import com.ksh.arrays.KshArrays;

public class ArraysTest {
	private static ArraysFactory arrays;
	private static AbstractArray abstArrays;

	@BeforeAll
	public static void init() {
		arrays = new KshArrays();
		abstArrays = new KshArrays();
	}

	@Test
	public void printArray() {
		int[] array = { 5, 78, 34, 56, 89 };
		int array1[] = { 567, 78, 34, 89 };

		arrays.printArray(array);
		abstArrays.printArrayForEach(array1);
		abstArrays.printArrayStream(array1);
	}

	@Test
	public void arrayMath() {
		int[] array = { 5, 78, 34, 56, 89 };
		
		Assertions.assertEquals(262, arrays.arraySum(array));
	}
}
