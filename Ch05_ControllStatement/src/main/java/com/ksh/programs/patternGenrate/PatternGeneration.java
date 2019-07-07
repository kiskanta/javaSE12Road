package com.ksh.programs.patternGenrate;

public interface PatternGeneration {
	/**
	 * 1
	 * 12
	 * 123
	 * 1234
	 * 12345
	 */
	public void pyramidPattern();
	
	/**
	 * 1
	 * 22
	 * 333
	 * 4444
	 * 55555
	 */
	public void pyramidPattern2();
	
	/**
	 * 54321
	 * 5432
	 * 543
	 * 54
	 * 5
	 */
	public void downPyramidPattern();
	
	/**
	 * 55555
	 * 4444
	 * 333
	 * 22
	 * 1
	 */
	public void downPyramidPattern2();
	
	/**
	 * 56789
	 * 5678
	 * 567
	 * 56
	 * 5
	 */
	public void downPyramidPattern3();
	
	/**
	 * 54321
	 * 4321
	 * 321
	 * 21
	 * 1
	 */
	public void downPyramidPattern4();
	
	/**
	 * 1
	 * 2  3
	 * 4  5  6
	 * 7  8  9  10
	 * 11 12 13 14 15
	 * 
	 */
	public void floydTriangle();

	/**
	 * 		   	   1
	 * 			1   1
	 * 		   1   2   1
	 *       1   3   3   1
	 *     1   4   6   4   1
	 *   1   5  10  10   5   1
	 * @param rows number for rows
	 */
	public void pascalTriangle(int rows);
	
	/**
	 *  *
		**
		***
		****
		*****
		*****
		****
		***
		**
		*
	 * @param number Rows number
	 */
	public void pyramidTriangle(int number);
	/**
	 *         *
		      ***
		     *****
		    *******
		   *********
		  ***********
		 *************
		***************
	 */
	public void pyramidPattern8(int number);
	
	/**
	 *                 1
		             2 1 2
		           3 2 1 2 3
		         4 3 2 1 2 3 4
		       5 4 3 2 1 2 3 4 5
		     6 5 4 3 2 1 2 3 4 5 6
		   7 6 5 4 3 2 1 2 3 4 5 6 7
		 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 
	 * @param number rows Number
	 */
	public void pyramidPattern9(int number);
	
	/**
	 *   1
		 2 4
		 3 6 9
		 4 8 12 16
		 5 10 15 20 25
	 * @param number rows number
	 */
	public void pattern15(int number);
	
	public void pattern16(int number);
}
