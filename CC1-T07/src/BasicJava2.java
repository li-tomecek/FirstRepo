
public class BasicJava2 {

	public static boolean match(char lowerCaseChar, char upperCaseChar)
	{
		if(lowerCaseChar >= 'a' && lowerCaseChar <= 'z')
		{
			if(upperCaseChar >= 'A' && upperCaseChar <= 'Z')
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	


	public static long ceiling(double num)
	{
		//If num is negative you round up the absolute value to the nearest int?
		long numAsLong = (long)num;
		
		if (numAsLong != num && num >= 0)
		{
			numAsLong++;
		}
		
		return numAsLong;
	}
	
	
	public static int count(String str, String chars)
	{
		int total = 0;
		
		for(int i = 0; i < chars.length(); i++)
		{
			char current = chars.charAt(i);
			
			for(int j = 0; j < str.length(); j++)
			{
				if(current == str.charAt(j))
				{
					total++;
				}
			}
		}

		return total;
	}
	
	public static int addHexDigits(int num)
	{
		int total = 0;
//		int remainder = 0;

//		while((num / 15) > 0)
//		{
//			remainder = num % 15;
//			total = total + remainder;
//
//			num = num / 15;
//		}
//		total = total + num;
		
		return 0;
	}	
	
}
