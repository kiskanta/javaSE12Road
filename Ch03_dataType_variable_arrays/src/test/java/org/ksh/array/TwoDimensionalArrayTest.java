package org.ksh.array;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ksh.arrays.twoD.Ksh2DArray;
import com.ksh.arrays.twoD.TwoDimensionalArray;

public class TwoDimensionalArrayTest {
	private static TwoDimensionalArray twoDArray;
	// private var matrix1 = {{7, 2}, {5, 3}}; // wrong
	private int[][] matrix1 = { { 7, 2 }, { 5, 3 } };
	private int[][] matrix2 = { { 2, 1 }, { 3, 1 } };
	private int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 8, 7, 6, 5 }, { 4, 3, 2, 1 } };

	@BeforeAll
	public static void init() {
		twoDArray = new Ksh2DArray();
	}

	@Test
	public void matrixTest() {
		
		int addedMatrix[][] = twoDArray.addition(matrix1, matrix2);
		int subtMatrix[][] = twoDArray.subtraction(matrix1, matrix2);
		int[] multplication[] = twoDArray.multiplication(matrix1, matrix2);
		
		try {
			System.out.println("Addtion of Matrix 1 is ");
			twoDArray.print2dArray(matrix1);
			
			System.out.println("and Matrix 2 is ");
			twoDArray.print2dArray(matrix2);
			System.out.println("of addtion is ");
			twoDArray.print2dArray(addedMatrix);
			System.out.println("of subtraction is ");
			twoDArray.print2dArray(subtMatrix);
			System.out.println("of Multiplication is ");
			twoDArray.print2dArray(multplication);
			System.out.println("of Multiplication is ");
			System.out.println("Sum of aboveDiangale is : ");
			twoDArray.print2dArray(matrix);
			int aboveDiangleSum = twoDArray.aboveDiagnalSum(matrix);
			System.out.println(aboveDiangleSum);
			int bellowDiangleSum = twoDArray.bellowDiagnalSum(matrix);
			System.out.println("And Sum of bellow Diangale is : "+bellowDiangleSum);
			int upperTriangleSum = twoDArray.upperTriangleSum(matrix);
			int lowerTriangleSum = twoDArray.lowerTriangleSum(matrix);
			
			System.out.println("Sum of upper Triangle is : "+upperTriangleSum+", lowwer Triangle is : "+lowerTriangleSum);
			System.out.println("Sum of Diangle is : "+twoDArray.bothDiangleSum(matrix));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
