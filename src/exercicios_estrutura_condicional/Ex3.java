package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		

		if (x % y == 0 || y % x == 0 ) // operador resto da divis�o + ou
			System.out.println("Sao Multiplos");
		else
			System.out.println("Nao sao Multiplos");

		sc.close();

	}

}
