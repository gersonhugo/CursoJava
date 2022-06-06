
public class _5FuncoesMatematicas {

	public static void main(String[] args) {

		double x, y;
		int z;
		x = 9;
		z = -10;

		x = Math.sqrt(x); // raiz quadrada
		y = Math.pow(z, 2);// potencia
		z = Math.abs(z);//valor absoluto (sem o negativo)

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		// baskara

		// calcular delta

		int a, b, c;
		a = -3;
		b = 3;
		c = 6;

		double delta;
		delta = Math.pow(b, 2) - 4 * a * c;

		System.out.println(delta);

		double x1 = (- b + Math.sqrt(delta)) / (2.0 * a);
		double x2 = (- b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println(x1);
		System.out.println(x2);
	}

}
