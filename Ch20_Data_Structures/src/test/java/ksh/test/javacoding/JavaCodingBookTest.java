package ksh.test.javacoding;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

import ksh.javacoding.ch01CountDuplicate.CountingDuplicate;

public class JavaCodingBookTest {

	@Test
	public void testDuplicateChar() {
		long startTime = System.nanoTime();
		CountingDuplicate dupCount = new CountingDuplicate();
		final String TEXT = "Be strong, be fearless, be beautiful. "
	            + "And believe that anything is possible when you have the right "
	            + "people there to support you. ";
	    final String TEXT_CP = TEXT + "😍 I love 💕 you Ӝ so much 💕 😍 🎼🎼🎼!";
		var result = dupCount.duplicateCount1("hihihihi$");
		var result2 = dupCount.duplicateCount2(TEXT_CP);
		var result3 = dupCount.duplicateCount3(TEXT_CP);
		var result4 = dupCount.duplicateCount4(TEXT_CP);
		
		var result5 = dupCount.duplicateCharacterVCP(TEXT_CP);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		displayExecutionTime(startTime);
		
	}
	
	private static void displayExecutionTime(long time){
		System.out.println("Execution time : "+time+" ns ( "+TimeUnit.MILLISECONDS.convert(time, TimeUnit.MICROSECONDS)+" ms)");
	}
}
