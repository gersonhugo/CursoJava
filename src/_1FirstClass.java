import java.util.Locale;

public class _1FirstClass {

	public static void main(String[] args) {

		int inteiro = 19 % 5;
		double altura = 1.73;
		char sexoUnicode = 'M';
		boolean aprendeJava = true;

		// ver código de cada caractere
		// unicode-table.com

		System.out.println("Primeiro Programa. Hello World!");
		System.out.println("Inteiro: " + inteiro);
		System.out.println("Altura: " + altura);
		System.out.println("Sexo: " + sexoUnicode);
		System.out.println("Aprende Java? " + aprendeJava);
		
		// comment

		double doubFormatado = 15.86468468;
		
		System.out.printf("%.2f%n", doubFormatado);
		
		// tambem pode usar barra invertida
		System.out.printf("%.4f\n", doubFormatado);
		
		// o printf pega o separador do idioma do computador
		// use Locale para resolver isso
		Locale.setDefault(Locale.US);
		
		System.out.printf("%.3f%n", doubFormatado);
		
		// concatenar usa o +
		
		System.out.println("teste" + "de" + "concatenação");
		System.out.println("teste " + "de " + "concatenação " + "2");
		
		// concatenar com printf
		System.out.printf("Inteiro: %d, Altura: %.2f, Sexo: %s, Double Formatado: %.3f%n", inteiro, altura, sexoUnicode, doubFormatado);
		
	}

}
