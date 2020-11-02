package com.adsense;

public class GenerateFizzBuzzReport {

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
		int fizz = 0;
		int buzz = 0;
		int fizzbuzz = 0;
		int lucky = 0;
		int unchangedInt = 0;
		for(int i = 1; i <= userValue; i++)
		{
			boolean returnedCheck = checkForLucky(i); 
			if(returnedCheck == true)
			{
				generatedString += "lucky";
				lucky += 1;
			}
			else {
				if(i % 15 == 0) {
					generatedString += "fizzbuzz";
					fizzbuzz += 1;
				}
				else if(i % 5 == 0)
				{
					generatedString += "buzz";
					buzz += 1;
					
				}
				else if(i % 3 == 0){
					generatedString += "fizz";
					fizz += 1;
				}
				else {
					generatedString += Integer.toString(i);
					unchangedInt += 1;
				}
			}
			generatedString += " ";
			
		}
		
		generatedString += "\nfizz: " + fizz + "\nbuzz: " + buzz + "\nfizzbuzz: " + fizzbuzz 
				+ "\nlucky: " + lucky + "\ninteger: " + unchangedInt;
			
		return generatedString;
	}
	
}
