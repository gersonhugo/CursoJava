package exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		int int1, int2, soma;

		Scanner sc = new Scanner(System.in);

		int1 = sc.nextInt();
		int2 = sc.nextInt();
		soma = int1 + int2;

		System.out.printf("SOMA = %d\n", soma);

		sc.close();
	}

}
