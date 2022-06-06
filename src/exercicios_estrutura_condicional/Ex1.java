package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		if (x < 0)
			System.out.println("NEGATIVO");
		else
			System.out.println("NAO NEGATIVO");

		sc.close();

	}

}
