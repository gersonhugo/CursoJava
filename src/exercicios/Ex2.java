package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		double raio, area;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		raio = sc.nextDouble();

		area = 3.14159 * Math.pow(raio, 2);

		System.out.printf("A=%.4f\n", area);

		sc.close();

	}

}
