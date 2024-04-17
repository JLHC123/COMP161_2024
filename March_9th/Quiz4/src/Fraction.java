public class Fraction 
{
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int getNumerator()
	{
		return this.numerator;
	}
	
	public int getDenominator()
	{
		return this.denominator;
	}
	
	public String toFraction()
	{
		return "Fraction: " + numerator + "/" + denominator;
	}
	
	public void setNumerator(int newNumerator)
	{
		this.numerator = newNumerator;
	}
	
	public String multiplyFraction(int secondNumerator, int secondDenonimator)
	{
		return "Fraction: " + this.numerator * secondNumerator + "/" + this.denominator * secondDenonimator;
	}
	
	public Fraction realMultiply(Fraction secondFraction)
	{
		int newNumerator = this.numerator * secondFraction.numerator;
		int newDenominator = this.denominator * secondFraction.denominator;
		Fraction result = new Fraction(newNumerator, newDenominator);
		return result;
	}
}
