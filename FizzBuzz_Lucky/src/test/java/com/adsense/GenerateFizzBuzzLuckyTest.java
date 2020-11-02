package com.adsense;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GenerateFizzBuzzLuckyTest {

	private GenerateFizzBuzzLucky genFizzBuzzLuck;
	
	@Before
	public void setUp() {
		genFizzBuzzLuck = new GenerateFizzBuzzLucky();
	}


	@Test
	public void fizzBuzzCheckForThree() {
		int isAThree = 3;
		
		assertEquals(true, genFizzBuzzLuck.checkForLucky(isAThree));
	}
	

	
	@Test
	public void fizzBuzzCheckForThree_false() {
		int isNotAThree = 14;
		
		assertEquals(false, genFizzBuzzLuck.checkForLucky(isNotAThree));
	}
	
	@Test
	public void FizzBuzzTestGeneratedString() {
		final String fizzBuzzString = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz ";
		assertEquals(fizzBuzzString, genFizzBuzzLuck.generateFizzBuzz(20));
	}

}
