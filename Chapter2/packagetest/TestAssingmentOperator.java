package packagetest;

public class TestAssingmentOperator { 

		public static void main (String[] args) {


		System.out.println("*** Main ***");


		TestAssingmentOperator tao = new TestAssingmentOperator();
		tao.assingment();


	}

	void assingment() {

		System.out.println("*** assingment ***");

		int a = 10;
		int b = ( a += 1 ); // se hacen dos asigaciones en la misma linea

		System.out.println("");
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		int c = ( b = 5 ); // se hacen dos asigaciones en la misma linea

		System.out.println("");
		System.out.println("b: " + b);
		System.out.println("c: " + c);

		boolean d = false;
		if ( d = true ) { // se hacen asigacion en un if 
			c=10;
		}
		System.out.println("");
		System.out.println("c: " + c);
		System.out.println("d: " + d);


	}
}