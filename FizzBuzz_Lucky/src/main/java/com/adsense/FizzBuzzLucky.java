package com.adsense;

import java.util.Scanner;

public class FizzBuzzLucky {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateFizzBuzzLucky fizzBuzzGen = new GenerateFizzBuzzLucky();
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		String returnedString = fizzBuzzGen.generateFizzBuzz(userInput);
		
		System.out.println(returnedString);
		
		scanner.close();
	}
	
}
