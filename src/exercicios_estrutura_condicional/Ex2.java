package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		if (x % 2 == 0) // operador resto da divisão
			System.out.println("PAR");
		else
			System.out.println("IMPAR");

		sc.close();

	}

}
