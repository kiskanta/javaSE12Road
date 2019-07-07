package com.ksh.bitwise.circut;

/**
 * 1. boolean short Circuit Operation</br>
 * <p>
 * 2. Java 8 stream short circuit Operations : are pre-defined short circuit
 * operations as intermediate and terminal operations both can be short circuit.
 * </p>
 * 
 * @author Kishore Kanta
 */
public interface ShortCircuitOperatorFactory {
	boolean orShortCircuit(boolean a, boolean b);

	boolean andShortCircuit(boolean a, boolean b);

	/**
	 * {@code Stream<T> limit(long maxSize)} - returns a new stream created from the
	 * stream, truncated to be no longer than maximum size in length.
	 */
	void intermediateShortCircuit();

	/**
	 * <p>
	 * Note : for a sequential stream there won't be any difference between
	 * {@code findFirst() } and {@code findAny() }. But for parallel stream find
	 * {@code findAny() } will return 'any' element rather than waiting for the
	 * 'first' element.
	 * </p>
	 */
	void terminalShortCircuit();
}
