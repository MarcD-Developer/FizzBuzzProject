package com.adsense;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzReportTest {

	private FizzBuzzReport reportTestClass;
	
	@Before
	public void setUp() {
		reportTestClass = new FizzBuzzReport();
	}
	
	@Test
	public void fizzBuzzMainTest() {
		reportTestClass = mock(FizzBuzzReport.class);
		
		String input = "20";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		
		String[] testArgs = { "20" };
		
		verify(reportTestClass).main(testArgs);
	}
}
