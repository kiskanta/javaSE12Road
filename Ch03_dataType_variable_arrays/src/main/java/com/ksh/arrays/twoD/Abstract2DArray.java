package com.ksh.arrays.twoD;

public abstract class Abstract2DArray implements TwoDimensionalArray {

	@Override
	public int[][] addition(int[][] matrix1, int[][] matrix2) {
		var rows = matrix1.length;
		var colums = matrix1[0].length;

		var addtion = new int[rows][colums];

		for (int r1 = 0; r1 < rows; r1++) {
			for (int c1 = 0; c1 < colums; c1++) {
				addtion[r1][c1] = matrix1[r1][c1] + matrix2[r1][c1];
			}
		}

		return addtion;
	}

	@Override
	public int[][] subtraction(int[][] matrix1, int[][] matrix2) {
		var rows = matrix1.length;
		var colums = matrix1[0].length;

		var subtraction = new int[rows][colums];

		for (int r1 = 0; r1 < rows; r1++) {
			for (int c1 = 0; c1 < colums; c1++) {
				subtraction[r1][c1] = matrix1[r1][c1] - matrix2[r1][c1];
			}
		}

		return subtraction;
	}

	@Override
	public int[][] multiplication(int[][] matrix1, int[][] matrix2) {
		var rows = matrix1.length;
		var colums = matrix1[0].length;
		if(rows == colums) {
			var multiplication = new int[rows][colums];
	
			for (int r1 = 0; r1 < rows; r1++) {
				for (int c1 = 0; c1 < colums; c1++) {
					multiplication[r1][c1] = matrix1[r1][c1] * matrix2[r1][c1];
				}
			}
			return multiplication;
		}else {
			return null;
		}
	}
	
	@Override
	public int aboveDiagnalSum(int[][] matrix) {
		int rowsSize = matrix.length;
		int sum=0;
		for(int colum=0; colum<rowsSize;colum++) {
			for(int rows=colum-1; rows>=0; rows--) {
				sum += matrix[rows][colum];
			}
		}
		return sum;
	}
	
	@Override
	public int bellowDiagnalSum(int[][] matrix) {
		int sum=0;
		int rowsLength = matrix.length;
		
		for(int rows=1; rows<rowsLength; rows++) {
			for(int columns = rows-1; columns >=0 ; columns-- ) {
				sum += matrix[rows][columns];
			}
		}
		return sum;
	}
	
	@Override
	public int upperTriangleSum(int[][] matrix) {
		int sum =0;
		for(int colums=0; colums<matrix.length; colums++) {
			for(int rows=colums; rows>=0; rows-- ) {
				sum += matrix[rows][colums];
			}
		}
		return sum;
	}
	
	@Override
	public int lowerTriangleSum(int[][] matrix) {
		int sum = 0;
		for(int rows=0; rows<matrix.length; rows++) {
			for(int colums=rows; colums>=0; colums-- ) {
				sum += matrix[rows][colums];
			}
		}
		return sum;
	}
	
	@Override
	public int bothDiangleSum(int[][] matrix) {
		int sumOfDiangle1 = 0, sumOfDiangle2 = 0;
		
		int rowsLength = matrix.length;
		int columLength = matrix[0].length;
		
		for(int i=0, j=0; i < rowsLength && j < columLength; i++, j++) {
			sumOfDiangle1 += matrix[i][j];
		}
		
		for(int i=0, j= columLength-1;  i< rowsLength && j>=0 ; i++, j--) {
			sumOfDiangle2 += matrix[i][j];
		}
		System.out.println("Sum of Diangle1 is :"+sumOfDiangle1+" Sum of Diangle 2 is "+sumOfDiangle2);
		return sumOfDiangle1 + sumOfDiangle2;
	}
}
