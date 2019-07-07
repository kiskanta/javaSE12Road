package com.ksh.programs.patternGenrate;

public abstract class AbstractPatternGeneration implements PatternGeneration {

	public void pyramidPattern() {
		System.out.println("Pyramid genration pattern");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	};

	@Override
	public void pyramidPattern2() {
		System.out.println("Pyramid genration pattern2");
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	@Override
	public void downPyramidPattern() {
		System.out.println("DownPyramid genration pattern");
		int n = 5;
		for (int i = n; i > 0; i--) {
			for (int j = n, k = 1; k <= i; k++, j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	@Override
	public void downPyramidPattern2() {
		System.out.println("DownPyramid genration pattern2");
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	@Override
	public void downPyramidPattern3() {
		System.out.println("DownPyramid genration pattern3");
		int n = 5;
		for (int i = n; i > 0; i--) {
			for (int j = n, k = 1; k <= i; k++, j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	@Override
	public void downPyramidPattern4() {
		System.out.println("DownPyramid genration pattern4");
		int n = 5;
		for (int i = n; i > 0; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	@Override
	public void floydTriangle() {
		System.out.println("Floyd Triangle pattern");
		int rows = 5, nextNumber = 1;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(nextNumber < 10 ? ("  " + nextNumber++) : (" " + nextNumber++));
			}
			System.out.println();
		}
	}

	@Override
	public void pascalTriangle(int rows) {
		System.out.println("Pascal Triangle pattern");

		// each number present in row is sum of the left & right number in above row.
		int nextNumber;

		for (int i = 0; i < rows; i++) {
			nextNumber = 1;
			for (int k = 0; k < (rows - i) * 2; k++) { // creates (rows-i)*2 spaces, for initial spacing.
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.format("%5d", nextNumber); // %4d creates 4 space between number.
				nextNumber = nextNumber * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

	@Override
	public void pyramidTriangle(int n) {

		for (int rows = 1; rows <= n; rows++) {
			for (int coulms = 1; coulms <= rows; coulms++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int rowsD = n; rowsD > 0; rowsD--) {
			for (int columD = 1; columD <= rowsD; columD++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	@Override
	public void pyramidPattern8(int n) {
		int space;
		System.out.println("PyramidPattern 8");
		for (int rows = 1; rows <= n; rows++) {

			for (space = 1; space <= n - rows; space++) {
				System.out.print(" ");
			}

			for (int leftS = 1; leftS <= n - space; leftS++) {
				System.out.print("*");
			}

			for (int rightS = n; rightS > space - 1; rightS--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	@Override
	public void pyramidPattern9(int number) {
		System.out.println("Number PyramidPattern 9");
		int space;
		for(int rows =1; rows <= number; rows++) {
			for(space =1; space <= (number-rows) * 2; space++) {
				System.out.print(" ");
			}
			
			for(int lefNum =rows; lefNum >= 1; lefNum--) {
				System.out.print(" "+lefNum);
			}
			
			for(int rightNum = 2; rightNum <= rows; rightNum++) {
				System.out.print(" "+rightNum);
			}
			
			System.out.println();
		}
	}
	
	
	@Override
	public void pattern15(int number) {
		System.out.println("Pattern 15");
		int n =6 ;
		
		for(int i=1; i<n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" "+i*j);
			}
			System.out.println();
		}
	}
	
	@Override
	public void pattern16(int number) {
		System.out.println("Pattern 6");
		int[][] ar = new int[number][];
		int start =0, prev = 0; 
		int sum =1;
		for(int rows=0; rows<number; rows++) {
			
			ar[rows] = new int[rows+1];
			prev =0;
			for(int j=0; j< ar[rows].length; j++) {
				if(rows > 0 && j>0) {
					prev = ar[rows][j-1];
					start = ar[rows-1][j-1];
					
					sum = start + prev;
					ar[rows][j] = sum; 
				}else {
					ar[rows][j] = sum;
				}
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}
}
