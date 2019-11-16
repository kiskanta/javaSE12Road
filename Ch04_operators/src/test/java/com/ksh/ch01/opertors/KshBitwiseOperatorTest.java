package com.ksh.ch01.opertors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ksh.operators.bitwise.BitwiseOperatorFactory;
import com.ksh.operators.bitwise.KshBitwiseOperator;

public class KshBitwiseOperatorTest {
	private static BitwiseOperatorFactory bitwiseFact;

	@BeforeAll
	public static void init() {
		bitwiseFact = new KshBitwiseOperator();
	}

	@Test
	public void testBitwiseUnaryNot() {
		var result_6 = bitwiseFact.bitwiseUnaryNot(5);
		Assertions.assertEquals(-6, result_6);
	}

	@Test
	public void testBitWiseAnd() {
		var result = bitwiseFact.bitwiseAnd(true, true);
		var result1 = bitwiseFact.bitwiseAnd(true, false);
		var result2 = bitwiseFact.bitwiseAnd(false, true);
		var result3 = bitwiseFact.bitwiseAnd(false, false);

		Assertions.assertEquals(true, result);
		Assertions.assertEquals(false, result1);
		Assertions.assertEquals(false, result2);
		Assertions.assertEquals(false, result3);
	}

	@Test
	public void testBitWiseOr() {
		var result = bitwiseFact.bitwiseOr(true, true);
		var result1 = bitwiseFact.bitwiseOr(true, false);
		var result2 = bitwiseFact.bitwiseOr(false, true);
		var result3 = bitwiseFact.bitwiseOr(false, false);
		Assertions.assertEquals(true, result);
		Assertions.assertEquals(true, result1);
		Assertions.assertEquals(true, result2);
		Assertions.assertEquals(false, result3);
	}

	@Test
	public void testShiftOpertions() {

		var unaryNot = bitwiseFact.bitwiseUnaryNot(60);
		// 64 - 01000 0000 - 1 0000 0000
		var leftShift = bitwiseFact.shiftLeft(64, 2);
		// 60 - 0011 1100 - 0000 1111
		var rightShift = bitwiseFact.shiftRight(60, 2);

		var zeroFilRightShift = bitwiseFact.shiftRightZeroFill(60, 2);

		var bitwiseAnd = bitwiseFact.bitwiseAnd(60, 13);
		var bitwiseOr = bitwiseFact.bitwiseOr(60, 13);

		Assertions.assertEquals(-61, unaryNot);
		Assertions.assertEquals(256, leftShift);
		Assertions.assertEquals(15, rightShift);
		Assertions.assertEquals(15, zeroFilRightShift);
		Assertions.assertEquals(12, bitwiseAnd);
		Assertions.assertEquals(61, bitwiseOr);
	}
}
