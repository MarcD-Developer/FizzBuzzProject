package com.adsense;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GenerateFizzBuzzReportTest {

	GenerateFizzBuzzReport generateFizzReportClass = new GenerateFizzBuzzReport();
	
	@Before
	public void setUp() {
		generateFizzReportClass = new GenerateFizzBuzzReport();
	}
	
	@Test
	public void fizzBuzzReportGeneratedString() {
		final String fizzBuzzString = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz "
				+ "\nfizz: 4\nbuzz: 3\nfizzbuzz: 1\nlucky: 2\ninteger: 10";
		assertEquals(fizzBuzzString, generateFizzReportClass.generateFizzBuzz(20));
	}
	
	@Test
	public void fizzBuzzCheckForThree() {
		int isAThree = 3;
		
		assertEquals(true, generateFizzReportClass.checkForLucky(isAThree));
	}
	
	@Test
	public void fizzBuzzCheckForThree_false() {
		int isNotAThree = 14;
		
		assertEquals(false, generateFizzReportClass.checkForLucky(isNotAThree));
	}
	
}
