public class FractionTest 
{
	public static void main(String[] args)
	{
		Fraction fract1 = new Fraction(5, 2);
		System.out.println(fract1);
		int getNumerator1 = fract1.getNumerator();
		System.out.println(getNumerator1);
		int getDenominator1 = fract1.getDenominator();
		System.out.println(getDenominator1);
		String toFraction1 = fract1.toFraction();
		System.out.println(toFraction1);
		fract1.setNumerator(10);
		toFraction1 = fract1.toFraction();
		System.out.println(toFraction1);
		Fraction fract2 = new Fraction(2, 4);
		System.out.print(fract2);
		int getNumerator2 = fract2.getNumerator();
		System.out.println(getNumerator2);
		int getDenominator2 = fract2.getDenominator();
		System.out.println(getDenominator2);
		String toFraction2 = fract2.toFraction();
		System.out.println(toFraction2);
		fract2.setNumerator(3);
		toFraction2 = fract2.toFraction();
		System.out.println(toFraction2);
		String multiplyFraction = fract1.multiplyFraction(3, 4);
		System.out.println(multiplyFraction);
		Fraction result = fract1.realMultiply(fract2);
		System.out.println(result);
		String toFractionresult = result.toFraction();
		System.out.println(toFractionresult);
		
	}
}
