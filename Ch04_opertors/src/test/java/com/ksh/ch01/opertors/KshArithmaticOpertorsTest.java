package com.ksh.ch01.opertors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ksh.operators.arithmetic.AbstractArithmeticOperators;
import com.ksh.operators.arithmetic.ArithmeticFactory;
import com.ksh.operators.arithmetic.KshArithmeticOperators;

public class KshArithmaticOpertorsTest {
	private static ArithmeticFactory ariFacto;
	private static AbstractArithmeticOperators arithmeticOper;
	byte b1 = 34, b2 = 74;
	short s1 = 23, s2 = 45;
	int i = 70, j = 80;
	long l1 = 56788l;
	long l2 = 3434L;
	float f1 = 17.34f, f2 = 34.56f;
	double d1 = 17.34;
	double d2 = 34.56f;

	@BeforeAll
	public static void init() {
		ariFacto = new KshArithmeticOperators();
		arithmeticOper = new KshArithmeticOperators();
	}

	@Test
	public void testAdditon() {
		var byteAddition = ariFacto.add(b1, b2);
		var shortAddition = ariFacto.add(s1, s2);
		var intAddition = ariFacto.add(3, 2);
		var longAddition = ariFacto.add(l1, l2);
		var floatAddition = ariFacto.add(f1, f2);
		var doubleAddition = ariFacto.add(d1, d2);

		Assertions.assertEquals(108, byteAddition);
		Assertions.assertEquals(68, shortAddition);
		Assertions.assertEquals(5, intAddition);
		Assertions.assertEquals(60222, longAddition);
		Assertions.assertNotEquals(5, floatAddition);
		Assertions.assertNotEquals(5, doubleAddition);
	}

	@Test
	public void testSubtraction() {
		var byteSubtraction = ariFacto.subtract(b1, b2);
		var shortSubtraction = ariFacto.subtract(s1, s2);
		var intSubtraction = ariFacto.subtract(3, 2);
		var longSubtraction = ariFacto.subtract(l1, l2);
		var floatSubtraction = ariFacto.subtract(f1, f2);
		var doubleSubtraction = ariFacto.subtract(d1, d2);

		Assertions.assertEquals(-40, byteSubtraction);
		Assertions.assertEquals(-22, shortSubtraction);
		Assertions.assertEquals(1, intSubtraction); // p1 -
		Assertions.assertEquals(53354, longSubtraction);
		Assertions.assertNotEquals(5, floatSubtraction);
		Assertions.assertNotEquals(5, doubleSubtraction);
	}

	@Test
	public void testMultiplcation() {
		var byteMultiplication = ariFacto.multiplication(b1, b2);
		var shortMultiplication = ariFacto.multiplication(s1, s2);
		var intMultiplication = ariFacto.multiplication(3, 2);
		var longMultiplication = ariFacto.multiplication(l1, l2);
		var floatMultiplication = ariFacto.multiplication(f1, f2);
		var doubleMultiplication = ariFacto.multiplication(d1, d2);

		Assertions.assertEquals(2516, byteMultiplication);
		Assertions.assertEquals(1035, shortMultiplication);
		Assertions.assertEquals(6, intMultiplication);
		Assertions.assertNotEquals(53354, longMultiplication);
		Assertions.assertNotEquals(5, floatMultiplication);
		Assertions.assertNotEquals(5, doubleMultiplication);
	}

	@Test
	public void testModulus() {
		var byteModulus = arithmeticOper.modulus(b1, b2);
		var shortModulus = arithmeticOper.modulus(s1, s2);
		var intModulus = arithmeticOper.modulus(3, 2);
		var longModulus = arithmeticOper.modulus(l1, l2);
		var floatModulus = arithmeticOper.modulus(f1, f2);
		var doubleModulus = arithmeticOper.modulus(d1, d2);

		Assertions.assertNotEquals(2516, byteModulus);
		Assertions.assertNotEquals(1035, shortModulus);
		Assertions.assertNotEquals(6, intModulus);
		Assertions.assertNotEquals(53354, longModulus);
		Assertions.assertNotEquals(5, floatModulus);
		Assertions.assertNotEquals(5, doubleModulus);
	}

	@Test
	public void testDivision() {
		var byteDivision = arithmeticOper.division(b1, b2);
		var shortDivision = arithmeticOper.division(s1, s2);
		var intDivision = arithmeticOper.division(3, 2);
		var longDivision = arithmeticOper.division(l1, l2);
		var floatDivision = arithmeticOper.division(f1, f2);
		var doubleDivision = arithmeticOper.division(d1, d2);

		Assertions.assertNotEquals(2516, byteDivision);
		Assertions.assertNotEquals(1035, shortDivision);
		Assertions.assertNotEquals(6, intDivision);
		Assertions.assertNotEquals(53354, longDivision);
		Assertions.assertNotEquals(5, floatDivision);
		Assertions.assertNotEquals(5, doubleDivision);
	}
}
