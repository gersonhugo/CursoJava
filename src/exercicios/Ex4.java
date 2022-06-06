package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, horas;
		double valor;
		
		num = sc.nextInt();
		horas = sc.nextInt();
		valor = sc.nextDouble();
		
		double sal = horas * valor;
		
		System.out.print("NUMBER = ");
		System.out.println(num);
		
		System.out.printf("SALARY = U$ %.2f\n", sal);
		
		sc.close();
		
	}

}
