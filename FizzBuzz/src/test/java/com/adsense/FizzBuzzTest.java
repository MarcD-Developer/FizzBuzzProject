package com.adsense;

import static org.junit.Assert.*;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz testClass;
	
	@Before
	public void setUp() {
		testClass = new FizzBuzz();
	}

	@Test
	public void FizzBuzzTestGeneratedString() {
		final String fizzBuzzString = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz ";
		assertEquals(fizzBuzzString, testClass.generateFizzBuzz(20));
	}
	
	@Test
	public void FizzBuzzTestMain() {
		testClass = mock(FizzBuzz.class);

		String input = "20";
		InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		
		
		String[] testArgs = { "20" };
		
		verify(testClass).main(testArgs);
	}

}
