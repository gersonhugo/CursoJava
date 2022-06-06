import java.util.Locale;
import java.util.Scanner;

public class _4EntradaDeDados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x = sc.next();

		System.out.println("Você digitou: " + x);

		sc.nextLine(); // quebra de linha
		int y = sc.nextInt();

		System.out.println("Você digitou o inteiro: " + y);

		double z = sc.nextDouble();
		System.out.printf("Você digitou o double: %.2f\n", z);

		char xx;
		xx= sc.next().charAt(0); // ler um caractere na posicao 0
		
		System.out.println(xx);
		
		//ler três tipos na mesma linha
		char a;
		int b;
		double c;
		
		a = sc.next().charAt(1);
		b = sc.nextInt();
		c = sc.nextDouble();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close();

	}

}
