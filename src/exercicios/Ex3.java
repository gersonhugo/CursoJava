package exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c, d;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		System.out.print("DIFERENCA = ");
		System.out.println(a * b - c * d);

		sc.close();
	}

}
