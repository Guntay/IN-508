package Fract;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Entrez un numerateur : ");
		int num = s.nextInt();
		System.out.println("Entrez un denominateur : ");
		int den = s.nextInt();

		Fractio f = new Fractio(num, den);
		String st = f.toString();
		System.out.println(st);

		s.close();

	}

}
