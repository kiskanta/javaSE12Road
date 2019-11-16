package com.ksh.operators.assignment;

/**
 * Compound Assignment Operator(=) / shorthand Assignment operators : is used to
 * assign a value to any variable. It has a 'right to left' associativity
 * 
 * @author Kanta Kishore
 *
 */
public interface AssignmentOperatorsFactory {
	/**
	 * +=
	 * 
	 * @return
	 */
	int incrementThenAssigns();

	/**
	 * -=
	 * 
	 * @return
	 */
	int decrementThenAssigns();

	/**
	 * *=
	 * 
	 * @return
	 */
	int multiplicationThenAssigns();

	/**
	 * (/=)
	 * 
	 * @return
	 */
	int divisonAssignment();

	/**
	 * %=
	 * 
	 * @return
	 */
	int modulusAssignments();

	/**
	 * Bitwise and assignment (&=)
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	int bitwiseAndAssignment(int a);

	/**
	 * Bitwise Or Assignment (|=)
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	int bitwiseOrAssignment(int a);

	/**
	 * Bitwise Exclusive Or assignment
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	int bitwiseExclusiveOrAssignment(int a);

	/**
	 * Shift Right Assignment (>>=)
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	int shiftRightAssignment(int a);

	/**
	 * Shift right zero fill Assignment (>>=)
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	int shiftRightZeroFillAssigment(int a);

	/**
	 * Shift left assignment (<<=):
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	int shiftLeftAssignment(int a);
}
