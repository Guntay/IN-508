package Fractio;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Entrez un num�rateur : ");
		int num = s.nextInt();
		System.out.println("Entrez un d�nominateur : ");
		int den = s.nextInt();
		
		Fraction f = new Fraction(num,den);
		String st = f.toString();
		System.out.println(st);
		
		s.close();
	}
}
