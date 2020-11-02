package com.adsense;

public class GenerateFizzBuzz {

	public static String generateFizzBuzz(int userInt) {
		int userValue = userInt;
		String generatedString = "";
		for(int i = 1; i <= userValue; i++)
		{
			if(i % 15 == 0) {
				generatedString += "fizzbuzz";
			}
			else if(i % 5 == 0)
			{
				generatedString += "buzz";
				
			}
			else if(i % 3 == 0){
				generatedString += "fizz";
			}
			else {
				generatedString += Integer.toString(i);
			}
			generatedString += " ";
		}
			
		return generatedString;
	}
	
}
