
public class Fraction 
{
	int numerator;
	int denominator;
	
	Fraction(int init_numerator, int init_denominator)
	{
		this.numerator = init_numerator;
		this.denominator = init_denominator;
	}
	
	Fraction()
	{
		
	}
	
	public String toString()
	{
		return "Fraction: " + this.numerator + "/" + this.denominator;
	}
	
	void setNumerator(int new_numerator)
	{
		this.numerator = new_numerator;
	}
	
	void setDenominator(int new_denominator)
	{
		this.denominator = new_denominator;
	}
}
