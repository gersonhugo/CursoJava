package exercicios_for;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double x1, x2, x3, media;

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			x1 = sc.nextDouble();
			x2 = sc.nextDouble();
			x3 = sc.nextDouble();
			media = ((x1*2) + (x2*3) + (x3*5)) / 10;
			System.out.printf("%.1f\n", media);
		}

		sc.close();
	}

}
