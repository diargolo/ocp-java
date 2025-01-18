package packagetest;

public class TestTypes {

	char caracter;
	int entero;
	boolean bol;
	byte bite;
	short corto;
	long largo;
	float flotante;
	double dobleFlotante;

	public static void main(String[] args) {

		int entero = 1;

		System.out.println("entero: " + entero);

		TestTypes test = new TestTypes();

		System.out.println("caracter: " + test.caracter);
		System.out.println("entero: " + test.entero);
		System.out.println("bol: " + test.bol);
		System.out.println("bite: " + test.bite);
		System.out.println("corto: " + test.corto);
		System.out.println("largo: " + test.largo);
		System.out.println("flotante: " + test.flotante);
		System.out.println("dobleFlotante: " + test.dobleFlotante);

		test.asignaciones();

	}

	void asignaciones() {

		// ** No compilan
		//int entero = 102030l;
		//long largo1 = 9020304050;
		//int octal = 0125967;
		//int hexa = 12345f;
		//int binario = 0B11003;

		long largo = 9020304050L;
		float flotante = 102030;
		float flotante1 = 102030F;
		int octal = 01234567;
		int hexa = 0x12345f;
		int binario = 0B1100;

		System.out.println("largo: " + largo);
		System.out.println("flotante: " + flotante);
		System.out.println("flotante1: " + flotante1);
		System.out.println("octal: " + octal);
		System.out.println("hexa: " + hexa);
		System.out.println("binario: " + binario);

	}
}













