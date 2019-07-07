package com.ksh.arrays.twoD;

public interface TwoDimensionalArray {
	/**
	 * Both matrix must have the same number of rows and columns.
	 * 
	 * @param matrix1
	 * @param matrix2
	 * @return
	 */
	int[][] addition(int[][] matrix1, int[][] matrix2);

	int[][] subtraction(int[][] matrix1, int[][] matrix2);

	int[][] multiplication(int[][] matrix1, int[][] matrix2);

	int aboveDiagnalSum(int[][] matrix);

	int bellowDiagnalSum(int[][] matrix);
	
	int upperTriangleSum(int[][] matrix);
	
	int lowerTriangleSum(int[][] matrix);
	
	int bothDiangleSum(int[][] matrix);
	public default void print2dArray(int[][] matrix) {
		if (matrix != null) {
			for (int rows = 0; rows < matrix.length; rows++) {
				for (int col = 0; col < matrix[0].length; col++) {
					System.out.print(matrix[rows][col] + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("given matrix should not be null");
		}
	}
}
