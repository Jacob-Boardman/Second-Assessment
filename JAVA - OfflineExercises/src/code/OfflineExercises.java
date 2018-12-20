package code;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) 
	{
		String str = "";
		for(int i = 0; i < input.length();i++)
		{
			str = str + input.substring(i, i+1)+input.substring(i,i+1)+input.substring(i,i+1);			
		}
		return str;
	}
	//
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) 
	{
		String str = "";
		int counter = 0;
		String middle = "";
		for(int i = 0; i< input.length()-3; i++)
		{
			if(input.substring(i, i+3).equals("bert"))
			{
				counter ++; 
				//middle = input.substring(i,i+4);				
			}
			if (counter == 2)
			{
				//str = 
			}		
		}
		
		return str;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) 
	{
		int min = Math.min(Math.min(a, b), c);
		int max = Math.max(Math.max(a, b), c);
		int medium = 0;
		
		if ((a == min && b == max) || (a == max && b == min))
		{
			medium = c;
		}
		else if ((b == min && c == max) || (b == max && c == min))
		{
			medium = a;
		}
		else 
		{
			medium = b;
		}
		
		int minDiff = Math.abs(medium-min);
		int maxDiff = Math.abs(max-medium); 		
		
		return (minDiff == maxDiff);
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) 
	{
		String str = "";
		
		str = input.substring(input.length()/2);
				
		return str;
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) 
	{
		String str = input.toLowerCase();
		
		if(input.length() > 3)
		{
			if(str.substring(str.length()-3).contains("dev"))
			{
				return true;
			}
		}		
		return false;
	}



	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) 
	{
		int counter = 0;
		int maxCounter = 0;
		
		if(input.equals("")) {
			return 0;
		}
		
		for(int i = 0; i < input.length()-1;i++)
		{
			if(input.charAt(i) == input.charAt(i+1))
			{
				counter ++;
				System.out.println(counter);
			}
			else
			{
				if (counter > maxCounter )
				{
					maxCounter = counter; 
					System.out.println(maxCounter);
					
				}
				counter = 0;
			}
			
		}
		
		System.out.println(maxCounter);
		return maxCounter;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") → 1
	//amISearch("I am in Amsterdam am I?") → 2
	//amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) 
	{ 
		int counter = 0;
		String[] words = arg1.toLowerCase().split(" ");
		for (int i = 0; i < words.length; i++)
		{
			if(words[i].equals("am"))
			{
				counter ++;
			}
		}
		return counter;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5 return "fizzbuzz"
	//
	//fizzBuzz(3) → "fizz"
	//fizzBuzz(10) → "buzz"
	//fizzBuzz(15) → "fizzbuzz"
	
	public String fizzBuzz(int arg1) 
	{
		if((arg1%3 == 0) && (arg1 % 5  == 0))
		{
			return "fizzbuzz";
		}
		else if (arg1 % 3 == 0)
		{
			return "fizz";
		}
		else
		{
			return "buzz";
		}
		
		
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") → 14
	//largest("15 72 80 164") → 11
	//largest("555 72 86 45 10") → 15
	
	public int largest(String arg1) 
	{
		String[] numbers = arg1.split(" ");
		for(int i = 0; i < numbers.length; i++)
		{
			
		}
		Integer first = Integer.getInteger(numbers[0]);
		
		//Integer firstNum = numbers[0];
		
		//System.out.println(first);
		
		return 0;
		
	}
	
	
}
