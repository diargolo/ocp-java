public class TestTernaryOperator { 

		public static void main (String[] args) {


		System.out.println("*** Main ***");


		TestTernaryOperator tto = new TestTernaryOperator();
		tto.check();


	}

	void check() {

		System.out.println("*** check ***"); 


		int a = 1, b = 5;
		int c = a < 1 ? 10 : 30;
		System.out.println("c: " + c); 

		c = a == 1 ? b < 6 ? 7 : 8 : 30;
		System.out.println("c: " + c); 

		// se entiende mejor con parentesis
		c = a == 1 ? ( ( b < 6 ) ? 7 : 8 ) : 30;
		System.out.println("c: " + c); 
	} 
}