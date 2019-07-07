package com.ksh.operators.bitwise;

public class KshBitwiseOperator extends AbstractBitwiseFactory {

	@Override
	public int bitwiseUnaryNot(int a) {
		return ~a;
	}

	@Override
	public int bitwiseAnd(int a, int b) {
		return a & b;
	}

	@Override
	public int bitwiseOr(int a, int b) {
		return a | b;
	}

	@Override
	public int shiftRight(int a, int b) {
		return a >> b;
	}

	@Override
	public int shiftRightZeroFill(int a, int b) {
		return a >>> b;
	}

	@Override
	public int shiftLeft(int a, int b) {
		return a << b;
	}

	@Override
	public boolean bitwiseAnd(boolean a, boolean b) {
		return a & b;
	}

	@Override
	public boolean bitwiseOr(boolean a, boolean b) {
		return a | b;
	}

	@Override
	public boolean equals(int a, int b) {
		return false;
	}

	@Override
	public boolean notEqualsTo(int a, int b) {
		return false;
	}

	@Override
	public boolean graterThan(int a, int b) {
		return false;
	}

	@Override
	public boolean lessThan(int a, int b) {
		return false;
	}

	@Override
	public boolean graterThanOrEquals(int a, int b) {
		return false;
	}

	@Override
	public boolean lessThanOrEquals(int a, int b) {
		return false;
	}

	@Override
	public int bitwiseExclusiveOr(int a, int b) {
		return 0;
	}

	@Override
	public boolean bitwiseExclusiveOr(boolean a, boolean b) {
		return false;
	}

}
