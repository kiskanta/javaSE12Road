package com.ksh.operators.bitwise;

public interface RelationalOperatorFactory {
	boolean equals(int a, int b);

	boolean notEqualsTo(int a, int b);

	boolean graterThan(int a, int b);

	boolean lessThan(int a, int b);

	boolean graterThanOrEquals(int a, int b);

	boolean lessThanOrEquals(int a, int b);
}
