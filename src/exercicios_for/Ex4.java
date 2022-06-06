package exercicios_for;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double x1, x2, div;

		div = 0;

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			x1 = sc.nextDouble();
			x2 = sc.nextDouble();
			if (x2 != 0) {
				div = (x1 / x2);
				System.out.printf("%.1f\n", div);
			} else
				System.out.println("divisao impossivel");
		}

		sc.close();
	}

}
