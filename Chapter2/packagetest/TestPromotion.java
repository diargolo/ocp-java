package packagetest;

public class TestPromotion { 

		public static void main (String[] args) {


		System.out.println("*** Main ***");


		TestPromotion tp = new TestPromotion();
		tp.promotion();


	}

	void promotion() {

		
		System.out.println("*** promotion ***");

		int a = 10;
		long b = 11;
		var c = a + b;

		System.out.print("Type c: ");
		Typetester.printType(c);

		int a1 = 10;
		long b1 = 11L;
		var c1 = a1 + b1;

		System.out.println("");
		System.out.print("Type c1: ");
		Typetester.printType(c1);

		int a2 = 10;
		float b2 = 11;
		var c2 = a2 + b2;

		System.out.println("");
		System.out.print("Type c2: ");
		Typetester.printType(c2);

		byte a3 = 1;
		byte b3 = 1;
		var c3 = a3 + b3; // lo escala automaticamente a entero

		System.out.println("");
		System.out.print("Type c3: ");
		Typetester.printType(c3);


		var c4 = (byte)a3 + (byte)b3; // el operador los escala a int

		System.out.println("");
		System.out.print("Type c4: ");
		Typetester.printType(c4);


		var c5 = (byte)(a3 + b3); // los casteo de int a byte

		System.out.println("");
		System.out.print("Type c5: ");
		Typetester.printType(c5);


		System.out.println("");
	}

	class Typetester {
	    static void printType(byte x) {
	        System.out.print(x + " is an byte");
	    }
	    static void printType(int x) {
	        System.out.print(x + " is an int");
	    }
	    static void printType(long x) {
	        System.out.print(x + " is an long");
	    }    
	    static void printType(float x) {
	        System.out.print(x + " is an float");
	    }
	    static void printType(double x) {
	        System.out.print(x + " is an double");
	    }
	    static void printType(char x) {
	        System.out.print(x + " is an char");
	    }
	}


}