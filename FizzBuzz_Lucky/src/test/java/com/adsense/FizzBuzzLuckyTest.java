package com.adsense;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzLuckyTest {

	private FizzBuzzLucky testClass;
	
	@Before
	public void setUp() {
		testClass = new FizzBuzzLucky();
	}
	
	@Test
	public void fizzBuzzMainTest() {
		FizzBuzzLucky testClass = mock(FizzBuzzLucky.class);
		
		 String input = "20";
		 InputStream in = new ByteArrayInputStream(input.getBytes());
		 System.setIn(in);
		
		
		String[] testArgs = { "20" };
		
		verify(testClass).main(testArgs);
	}

}
