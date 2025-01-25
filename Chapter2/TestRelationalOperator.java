public class TestRelationalOperator { 

		public static void main (String[] args) {


		System.out.println("*** Main ***");


		TestRelationalOperator tro = new TestRelationalOperator();
		tro.instanceOf_();


	}

	void instanceOf_() {

		System.out.println("*** instanceOf_ ***");

		Integer a = 1;
		System.out.println("");
		System.out.print("a: ");
		this.printInstanceOf(a);

		Short b = 1;
		System.out.println("");
		System.out.print("b: ");
		this.printInstanceOf(b);

		Short c = null;
		System.out.println("");
		System.out.print("c: ");
		this.printInstanceOf(c);

	}

	void printInstanceOf(Object val) {
		if( val instanceof Integer) {
			System.out.print("instanceOf_: Integer");
		} else if( val instanceof Short) {
			System.out.print("instanceOf_: Short");
		} else {
			System.out.print("desconocido");
		}
	}
}