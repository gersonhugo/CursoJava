package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, tri, cir, tra, qua, ret;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		tri = a * c / 2;
		cir = 3.14159 * Math.pow(c, 2);
		tra = (((a - b) / 2) + b) * c;
		qua = Math.pow(b, 2);
		ret = a * b;

		System.out.printf("TRIANGULO: %.3f\n", tri);
		System.out.printf("CIRCULO: %.3f\n", cir);
		System.out.printf("TRAPEZIO: %.3f\n", tra);
		System.out.printf("QUADRADO: %.3f\n", qua);
		System.out.printf("RETANGULO: %.3f\n", ret);

		sc.close();

	}

}
