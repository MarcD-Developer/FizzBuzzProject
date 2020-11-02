package com.adsense;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GenerateFizzBuzzTest {

	private GenerateFizzBuzz fizzBuzzGenTest;
	
	@Before
	public void setUp() {
		fizzBuzzGenTest = new GenerateFizzBuzz();
	}


	@Test
	public void FizzBuzzTestGeneratedString() {
		final String fizzBuzzString = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz ";
		assertEquals(fizzBuzzString, fizzBuzzGenTest.generateFizzBuzz(20));
	}
	

}
