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

public class NumberOfWordsIn_test 
{
	public static void main(String[] args)
	{
		System.out.println("Number of words: " + NumberOfWordsIn.numberOfWordsIn("You had me at hello."));
		System.out.println("Number of words: " + NumberOfWordsIn.numberOfWordsIn("I'm gonna."));
		System.out.println("Number of words: " + NumberOfWordsIn.numberOfWordsIn("Go ahead"));
		System.out.println("Number of words: " + NumberOfWordsIn.numberOfWordsIn("pseudo-code"));
	}
}
