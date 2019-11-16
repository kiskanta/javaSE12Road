package com.ksh.ch01.opertors;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ksh.operators.assignment.AssignmentOperatorsFactory;
import com.ksh.operators.assignment.KshAssignmentOpertors;

public class KshAssignmentOpertorTest {
	private static AssignmentOperatorsFactory assignemenFactory;

	@BeforeAll
	public static void init() {
		assignemenFactory = new KshAssignmentOpertors();
	}

	@Test
	public void assignmentTest() {
		assignemenFactory.incrementThenAssigns();
		assignemenFactory.decrementThenAssigns();
		assignemenFactory.multiplicationThenAssigns();
		assignemenFactory.divisonAssignment();
		assignemenFactory.modulusAssignments();
		assignemenFactory.bitwiseAndAssignment(5);
		assignemenFactory.bitwiseOrAssignment(5);
		assignemenFactory.bitwiseExclusiveOrAssignment(5);
		assignemenFactory.shiftRightAssignment(5);
		assignemenFactory.shiftRightZeroFillAssigment(5);
		assignemenFactory.shiftLeftAssignment(5);
	}

}
