package com.adsense;

public class GenerateFizzBuzzLucky {

	public static boolean checkForLucky(int checkNum) {
		
		boolean containsThree = false;
		
		if(String.valueOf(checkNum).contains("3")) {
			containsThree = true;
		}
		
		return containsThree;
	}
	
	public static String generateFizzBuzz(int userInt) {
		int userValue = userInt;
		String generatedString = "";
		boolean checkForThree = false;
		for(int i = 1; i <= userValue; i++)
		{
			checkForThree = checkForLucky(i);
			if(checkForThree == true)
			{
				generatedString += "lucky";
			}
			else {
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
			}
			generatedString += " ";
		}
			
		return generatedString;
	}
	
}
