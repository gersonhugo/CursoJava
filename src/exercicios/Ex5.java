package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num1, num2;
		double val1, val2;

		sc.nextInt();
		num1 = sc.nextInt();
		val1 = sc.nextDouble();

		sc.nextInt();
		num2 = sc.nextInt();
		val2 = sc.nextDouble();

		double pagar = (num1 * val1) + (num2 * val2);

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", pagar);

		sc.close();

	}

}
