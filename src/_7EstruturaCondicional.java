import java.util.Scanner;

public class _7EstruturaCondicional {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hora;

		System.out.println("Quantas horas? ");
		hora = sc.nextInt();

		// se houver apenas uma linha as chaves são opicionais
//		if (hora < 12)
//			System.out.println("Bom dia");

		if (hora < 12) {
			System.out.println("Bom dia");
		} 
		else if (12 <= hora && hora < 18) {
			System.out.println("Boa tarde");
		} 
		else {
			System.out.println("Boa noite");
		}

		sc.close();
	}

}
