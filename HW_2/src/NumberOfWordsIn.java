/* Return the number of words in the given String. The beginning of a word is defined as a 
letter either at the beginning of the String or preceded by white space. (Note: 
Character.isLetter(char) and Character.isWhitespace(char) tests if char is an alphabetic letter
and white space respectively.)
numberOfWordsIn ( “You had me at hello.” ) → 5
numberOfWordsIn ( “I'm gonna.” ) →2
numberOfWordsIn ( “Go ahead” ) → 2
numberOfWordsIn ( “pseudo-code” ) → 1
public static int numberOfWordsIn ( String str ) { 
} */

public class NumberOfWordsIn
{
	public static int numberOfWordsIn(String str)
	{
		int wordCount = 0;
		boolean insideWord = false;
		
		for (char i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			if (Character.isLetter(c))
			{
				if (!insideWord)
				{
					wordCount = wordCount + 1;
					insideWord = true;
				}
			}
			
			else if (Character.isWhitespace(c))
			{
				insideWord = false;
			}
		}
		
		return wordCount;
	}
}