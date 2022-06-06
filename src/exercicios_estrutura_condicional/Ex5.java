package exercicios_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int key = sc.nextInt();
		int qtde = sc.nextInt();
		double total = 0.0;

		switch (key) {
		case 1: {
			total = 4.0 * qtde;
			break;
		}
		case 2: {
			total = 4.50 * qtde;
			break;
		}
		case 3: {
			total = 5.0 * qtde;
			break;
		}
		case 4: {
			total = 2.0 * qtde;
			break;
		}
		case 5: {
			total = 1.5 * qtde;
			break;
		}
		default:
		}

		System.out.printf("Total: R$ %.2f%n", total);

		sc.close();

	}

}
