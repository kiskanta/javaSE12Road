package com.ksh.operators.assignment;

public class KshAssignmentOpertors extends AbstractAssignmentOpertors {

	@Override
	public int incrementThenAssigns() {
		int x = 5;
		x += 5;
		System.out.println("+= increment then assigns is "+x);
		return x;
	}

	@Override
	public int decrementThenAssigns() {
		int x = 5;
		x -= 5;
		System.out.println("-= decrement then assigns is "+x);
		return x;
	}

	@Override
	public int multiplicationThenAssigns() {
		int x = 5;
		x *= 5;
		System.out.println("*= multiplication then assigns is "+x);
		return x;
	}

	@Override
	public int divisonAssignment() {
		int x = 5;
		x /= 5;
		System.out.println("/= divison assignment is "+x);
		return x;
	}

	@Override
	public int modulusAssignments() {
		int x = 5;
		x %= 5;
		System.out.println("%= modulus assignment is "+x);
		return x;
	}

	@Override
	public int bitwiseAndAssignment(int a) {
		a &= 5;
		System.out.println("&= bitwise and assignment is "+a);
		return a;
	}

	@Override
	public int bitwiseOrAssignment(int a) {
		a |= 5;
		System.out.println("|= bitwiseOr assignment is "+a);
		return a;
	}

	@Override
	public int bitwiseExclusiveOrAssignment(int a) {
		a ^= 5;
		System.out.println("^= bitwiseExclusive assignment is "+a);
		return a;
	}

	@Override
	public int shiftRightAssignment(int a) {
		a >>= 5;
		System.out.println(">>= Shift Right assignment is "+a);
		return a;
	}

	@Override
	public int shiftRightZeroFillAssigment(int a) {
		a >>>= 5;
		System.out.println(">>>= Shift Right Zero assignment is "+a);
		return a;
	}

	@Override
	public int shiftLeftAssignment(int a) {
		a <<= 5;
		System.out.println("<<= Shift Right assignment is "+a);
		return a;
	}
}