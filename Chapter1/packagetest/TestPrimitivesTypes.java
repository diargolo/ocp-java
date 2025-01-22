package packagetest;

public class TestPrimitivesTypes {

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

		TestPrimitivesTypes test = new TestPrimitivesTypes();

		System.out.println("caracter: " + test.caracter);
		System.out.println("entero: " + test.entero);
		System.out.println("bol: " + test.bol);
		System.out.println("bite: " + test.bite);
		System.out.println("corto: " + test.corto);
		System.out.println("largo: " + test.largo);
		System.out.println("flotante: " + test.flotante);
		System.out.println("dobleFlotante: " + test.dobleFlotante);

		test.asignaciones();
		test.var();

	}

	void asignaciones() {

		System.out.println("** function asignaciones **");

		// ** No compilan
		//int entero = 102030l;
		//int val = null;
		//long largo1 = 9020304050;
		//int octal = 0125967;
		//int hexa = 12345f;
		//int binario = 0B11003;
		//int _under = _123;
		//double flotante = 102030_.0;


		int _under = 1_23;
		long largo = 9020304050L;
		float flotante = 102030;
		float flotante1 = 102030F;
		double dobleFlotante = 102030_0.0;

		int octal = 01234567;
		int hexa = 0x12345f;
		int binario = 0B1100;

		System.out.println("_under: " + _under);
		System.out.println("largo: " + largo);
		System.out.println("flotante: " + flotante);
		System.out.println("flotante1: " + flotante1);
		System.out.println("dobleFlotante: " + dobleFlotante);
		System.out.println("octal: " + octal);
		System.out.println("hexa: " + hexa);
		System.out.println("binario: " + binario);

	}

	void var() { 

		System.out.println("** function var **");

		var a = 10;
		System.out.println("a: " + a);

		//int var = 10,c = 10; // ERROR
		
		int b = 10,c = 10;
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}
}













