package exercicios_for;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, q, c;

		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			q = i * i;
			c = q * i;
			System.out.printf("%d %d %d\n", i, q, c);
		}

		sc.close();
	}

}
