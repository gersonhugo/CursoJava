package exercicios_for;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, f;

		n = sc.nextInt();
		f = n;

		if (f == 0)
			f = 1;

		for (int i = n - 1; i > 1; i--)
			f *= i;

		System.out.println(f);
		sc.close();
	}

}
