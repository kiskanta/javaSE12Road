package com.pattern;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ksh.programs.patternGenrate.KshPatternGeneration;
import com.ksh.programs.patternGenrate.PatternGeneration;

public class PatternGenrationTest {
	private static PatternGeneration patternGeneration = null;

	@BeforeAll
	public static void init() {
		patternGeneration = new KshPatternGeneration();
	}

	@Test
	public void patternTest() {
		patternGeneration.pyramidPattern();
		patternGeneration.pyramidPattern2();

		patternGeneration.downPyramidPattern();
		patternGeneration.downPyramidPattern2();
		patternGeneration.downPyramidPattern3();
		patternGeneration.downPyramidPattern4();
		
		patternGeneration.floydTriangle();
		patternGeneration.pascalTriangle(5);
		
		patternGeneration.pyramidTriangle(5);
		
		patternGeneration.pyramidPattern8(8);
		
		patternGeneration.pyramidPattern9(8);
		
		patternGeneration.pattern15(5);
		patternGeneration.pattern16(5);
	}
	
	@Test
	public void triAngle() {
		patternGeneration.rightAngle(6, '#');
		patternGeneration.rightAngle2(6, '#');
	}
}