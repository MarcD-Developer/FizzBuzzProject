package com.adsense;

import java.util.Scanner;

public class FizzBuzzReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateFizzBuzzReport generateReport = new GenerateFizzBuzzReport();
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		String returnedString = generateReport.generateFizzBuzz(userInput);
		
		System.out.println(returnedString);
		
		scanner.close();
	}
}