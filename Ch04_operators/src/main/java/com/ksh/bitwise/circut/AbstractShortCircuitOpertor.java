package com.ksh.bitwise.circut;

import java.util.stream.IntStream;

public abstract class AbstractShortCircuitOpertor implements ShortCircuitOperatorFactory {
	
	abstract void withLimit(IntStream stream);

	abstract void withOutLimit(IntStream stream);

	abstract void findFirst(IntStream stream);

	abstract void findany(IntStream stream);

	abstract boolean allMatch();

	abstract boolean anyMatch();

	abstract boolean nonMatch();
}
