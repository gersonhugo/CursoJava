package exercicios_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double imposto = 0.0;

		double salario = sc.nextDouble();

		if (salario >= 0 && salario <= 2000)
			imposto = 0.0;

		else if (salario >= 2000.01 && salario <= 3000) {
			imposto = (salario - 2000) * 0.08;

		} else if (salario >= 3000.01 && salario <= 4500) {
			imposto = (salario - 2000);
			imposto = (1000 * 0.08) + ((imposto - 1000) * 0.18);

		} else if (salario > 4500) {
			imposto = (salario - 2000);
			imposto = (1000 * 0.08) + (1500 * 0.18) + ((imposto - 2500) * 0.28);

		}

		if (imposto == 0.0)
			System.out.println("Isento");
		else
			System.out.printf("R$ %.2f\n", imposto);
		
		sc.close();

	}

}
