package com.ksh.bitwise.circut;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class KshShortCircuitOpertors extends AbstractShortCircuitOpertor {

	@Override
	public boolean orShortCircuit(boolean a, boolean b) {
		var or = (a || b) ? true : false;
		return or;
	}

	@Override
	public boolean andShortCircuit(boolean a, boolean b) {
		var and = (a && b) ? true : false;
		return and;
	}

	@Override
	public void intermediateShortCircuit() {
		int[] intArr = { 5, 6, 4, 2, 3, 1 };
		withLimit(Arrays.stream(intArr));
		withOutLimit(Arrays.stream(intArr));
	}

	@Override
	public void terminalShortCircuit() {
		IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		findany(intStream);
		findFirst(intStream);

		allMatch();
		anyMatch();
		nonMatch();
	}

	@Override
	public void withLimit(IntStream stream) {
		stream.filter(i -> i % 2 == 0).limit(2).forEach(System.out::println);
	}

	@Override
	public void withOutLimit(IntStream stream) {
		stream.filter(i -> i % 2 == 0).forEach(System.out::println);
	}

	@Override
	void findFirst(IntStream stream) {
		OptionalInt oInt = stream.filter(i -> i % 3 == 0).findFirst();

		if (oInt.isPresent()) {
			System.out.println(oInt.getAsInt());
		}
	}

	@Override
	void findany(IntStream stream) {
		OptionalInt oInt = stream.filter(i -> i % 2 == 0).findAny();

		if (oInt.isPresent()) {
			System.out.println(oInt.getAsInt());
		}
	}

	@Override
	boolean allMatch() {
		Stream<String> stream = Stream.of("one", "two", "three");
		var allMath = stream.allMatch(s -> s.length() > 0 && Character.isLowerCase(s.charAt(0)));
		return allMath;
	}

	@Override
	boolean anyMatch() {
		Stream<String> stream = Stream.of("one", "two", "three");
		var anyMath = stream.anyMatch(s -> s.length() > 0 && Character.isLowerCase(s.charAt(0)));
		return anyMath;
	}

	@Override
	boolean nonMatch() {
		Stream<String> stream = Stream.of("One", "Two", "Three");
		var nonMatch = stream.noneMatch(s -> s.length() > 0 && Character.isUpperCase(s.charAt(0)));
		return nonMatch;
	}
}
