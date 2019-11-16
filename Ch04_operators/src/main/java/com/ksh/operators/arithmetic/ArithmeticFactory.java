package com.ksh.operators.arithmetic;

/**
 * Arithmetic Operators - + Addition, - subtraction, * multiplication, /
 * division, % modulus, ++ increment, -- Decrement (++, -- are also pre or post
 * increment/decrement.).
 * 
 * @author Kanta Kishore.
 *
 */
public interface ArithmeticFactory {
	/**
	 * byte - stores who numbers form -128 to 127. size 1 bit.
	 * 
	 * @param i first byte number
	 * @param j 2nd byte number
	 * @return addition of two byte number is an int
	 */
	int add(byte i, byte j);

	/**
	 * short Data type - stores who numbers form -32768 to 32767. size is 16 bits.
	 * 
	 * @param i first short number
	 * @param j 2nd short number
	 * @return addition of two short number is an int
	 */
	int add(short i, short j);

	/**
	 * int data type - stores. size is 32 bits, -2^32 to 2^32-1. <br/>
	 * Note: Java 8 and later int is an unsigned 32-bt integer, which value range
	 * 0-2^32
	 * 
	 * @param i first short number
	 * @param j 2nd short number
	 * @return addition of two short number is an int
	 */
	int add(int i, int j);

	/**
	 * long data type : 64 bit( 2^63 to 2^63-1) Note: end the value with an 'L'<br/>
	 * Note: Java 8 and later long is an unsigned 64-bt integer, which value range
	 * 0-2^64
	 * 
	 * @param i
	 * @param j
	 * @return
	 */
	long add(long i, long j);

	/**
	 * flat data type - stores fractional numbers from 3.4e-038 to 3.4e+038.
	 * sufficient for storing 6 to 7 decimal digits. size 32 bits. Note: end the
	 * value with an 'f'
	 * 
	 * @param i first float decimal
	 * @param j 2nd float decimal
	 * @return addition of two short decimals
	 */
	float add(float i, float j);

	/**
	 * double data type - stores fractional numbers from 3.4e-038 to 3.4e+038.
	 * sufficient for storing 6 to 15 decimal digits. size 64 bits.
	 * 
	 * @param i first float decimal
	 * @param j 2nd float decimal
	 * @return addition of two short decimals
	 */
	double add(double i, double j);

	// subtract
	/**
	 * byte - stores who numbers form -128 to 127. size 1 bit.
	 * 
	 * @param i first byte number
	 * @param j 2nd byte number
	 * @return addition of two byte number is an int
	 */
	int subtract(byte i, byte j);

	/**
	 * short Data type - stores who numbers form -32768 to 32767. size is 16 bits.
	 * 
	 * @param i first short number
	 * @param j 2nd short number
	 * @return addition of two short number is an int
	 */
	int subtract(short i, short j);

	/**
	 * int data type - stores. size is 32 bits, -2^31 to 2^31-1.
	 * 
	 * @param i first short number
	 * @param j 2nd short number
	 * @return addition of two short number is an int
	 */
	int subtract(int i, int j);

	/**
	 * long data type : 64 bit( 2^63 to 2^63-1) Note: end the value with an 'L'
	 * 
	 * @param i
	 * @param j
	 * @return
	 */
	long subtract(long i, long j);

	/**
	 * flat data type - stores fractional numbers from 3.4e-038 to 3.4e+038.
	 * sufficient for storing 6 to 7 decimal digits. size 32 bits. Note: end the
	 * value with an 'f'
	 * 
	 * @param i first float decimal
	 * @param j 2nd float decimal
	 * @return addition of two short decimals
	 */
	float subtract(float i, float j);

	/**
	 * double data type - stores fractional numbers from 3.4e-038 to 3.4e+038.
	 * sufficient for storing 6 to 15 decimal digits. size 64 bits.
	 * 
	 * @param i first float decimal
	 * @param j 2nd float decimal
	 * @return addition of two short decimals
	 */
	double subtract(double i, double j);

	int multiplication(byte i, byte j);

	int multiplication(short i, short j);

	int multiplication(int i, int j);

	long multiplication(long i, long j);

	float multiplication(float i, float j);

	double multiplication(double i, double j);

	int division(byte i, byte j);

	int division(short i, short j);

	int division(int i, int j);

	long division(long i, long j);

	float division(float i, float j);

	double division(double i, double j);

}
