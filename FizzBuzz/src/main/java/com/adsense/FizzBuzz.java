package com.adsense;

import java.util.Scanner;

public class FizzBuzz {

	public static String generateFizzBuzz(int userInt) {
		int userValue = userInt;
		String generatedString = "";
		for(int i = 1; i <= userValue; i++)
		{
			if(i % 15 == 0) {
				generatedString += "fizzbuzz";
				System.out.println("fizzbuzz");
			}
			else if(i % 5 == 0)
			{
				generatedString += "buzz";
				System.out.println("buzz");
				
			}
			else if(i % 3 == 0){
				generatedString += "fizz";
				System.out.println("fizz");
			}
			else {
				generatedString += Integer.toString(i);
				System.out.println(i);
			}
			generatedString += " ";
		}
			
		return generatedString;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		String returnedString = generateFizzBuzz(userInput);
		
		System.out.println(returnedString);
		
		scanner.close();
	}

}
