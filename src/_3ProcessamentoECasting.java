
public class _3ProcessamentoECasting {

	public static void main(String[] args) {

		int x, y;

		x = 5;
		y = 2 * x;

		System.out.println(x);
		System.out.println(y);

		double z = 3.0;
		// usa '.0' para identificar double

		float a = 3f;
		// usa 'f' para identifcar o float

		System.out.println(z);
		System.out.println(a);

		y = 4 * (int) z; // casting, converteu double para int
		
		System.out.println(y);
		
		x = 5;
		y = 2;
		
		z = x / y;
		
		System.out.println("z: " + z);
		
		z = (double) x / y;
		
		System.out.println("z: " + z + " com casting");
	}

}
