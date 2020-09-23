package Fractio;

public class Fraction 
{
	public int num;
	public int den;
	
	Fraction(int num, int den)
	{
		this.num = num;
		this.den = den;
	}
	
	public String toString()
	{
		return Integer.toString(this.num)+'/'+Integer.toString(this.den);
	}
}
