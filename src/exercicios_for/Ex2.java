package exercicios_for;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, x, in, out;

		in = 0;
		out = 0;

		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			x = sc.nextInt();
			if (x >= 10 && x <= 20)
				in++;
			else
				out++;
		}
		
		System.out.printf("%d in\n", in);
		System.out.printf("%d out\n", out);

		sc.close();
	}

}
