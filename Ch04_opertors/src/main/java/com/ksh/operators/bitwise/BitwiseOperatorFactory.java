package com.ksh.operators.bitwise;

/**
 * Bitwise operators : are used to perform manipulation of individual bits of a
 * number. They can be used with any of the integer types. They are used when
 * performing update and query operations of binary index tree.
 * 
 * @author Kanta Kishore
 *
 */
public interface BitwiseOperatorFactory {
	/**
	 * bitwise complement, the unary NOT operator (~), inverts all of the bits of
	 * its operand.
	 * 
	 * @param a
	 * @return
	 */
	int bitwiseUnaryNot(int a);

	/**
	 * Binary AND (&) copies a bit to the result if exists in both operands.
	 * 
	 * @param a
	 * @param b
	 * @return bitwiseAnd result.
	 */
	int bitwiseAnd(int a, int b);

	/**
	 * Binary OR (|) copies a bit to the result if exists in both operands.
	 * 
	 * @param a
	 * @param b
	 * @return bitwiseAnd result.
	 */
	int bitwiseOr(int a, int b);

	int bitwiseExclusiveOr(int a, int b);

	/**
	 * value << num. Shifts all of the bits in a value to the right a specified
	 * number of times <br/>
	 * Outcome of byte, short promotes to int,
	 * 
	 * @param a value
	 * @param b num
	 * @return shifted value
	 */
	int shiftRight(int a, int b);

	/**
	 * Shift right zero fill operator. The left operands value is moved right by the
	 * number of bits specified by the right operand and shifted values are filled
	 * up with zero,
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	int shiftRightZeroFill(int a, int b);

	/**
	 * value << num. Shifts all of the bits in a value to the left a specified
	 * number of times <br/>
	 * Outcome of byte, short promotes to int,
	 * 
	 * @param a value
	 * @param b num
	 * @return shifted value
	 */
	int shiftLeft(int a, int b);
	
	/**
	 * bitwise inclusive AND operator(|)
	 * 
	 * @param a boolean value
	 * @param b boolean value
	 * @return inclusive AND operator value
	 */
	boolean bitwiseAnd(boolean a, boolean b);

	/**
	 * bitwise inclusive OR operator(|)
	 * 
	 * @param a boolean value
	 * @param b boolean value
	 * @return inclusive OR operator value
	 */
	boolean bitwiseOr(boolean a, boolean b);

	/**
	 * bitwise exclusive Or(^)
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	boolean bitwiseExclusiveOr(boolean a, boolean b);
}
