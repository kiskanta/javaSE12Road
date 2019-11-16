package com.ksh.ch01.opertors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ksh.bitwise.circut.KshShortCircuitOpertors;
import com.ksh.bitwise.circut.ShortCircuitOperatorFactory;

public class ShortCircuitOpertorTest {
	private static ShortCircuitOperatorFactory shortCircuit = null;;

	@BeforeAll
	public static void init() {
		shortCircuit = new KshShortCircuitOpertors();
	}

	@Test
	public void booleanTest() {
		Assertions.assertTrue(shortCircuit.andShortCircuit(true, true));
		Assertions.assertFalse(shortCircuit.andShortCircuit(false, false));

		Assertions.assertTrue(shortCircuit.orShortCircuit(true, true));
		Assertions.assertTrue(shortCircuit.orShortCircuit(false, true));
	}

	@Test
	public void intermediateTest() {
		shortCircuit.intermediateShortCircuit();
	}
}
