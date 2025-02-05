public class TestLoops { 

		public static void main (String[] args) {


		System.out.println("*** Main ***");


		TestLoops tl = new TestLoops();

		tl.testFor(5);
		tl.testForEach(5);

		

	}

	void testFor(int num) { 

		System.out.println("");
		System.out.println("*** testFor ***");

		System.out.println("");
		System.out.println("condicion false 10 < 5");

		for ( int i = 10; i < 5; i++) {
			System.out.println("i: " + i);
		}

		System.out.println("");
		System.out.println("condicion true 0 < 5; i++ ");
		for ( int i = 0; i < 5; i++) {
			System.out.println("i: " + i);
		}


		System.out.println("");
		System.out.println("condicion true 0 < 5; ++i ");
		for ( int i = 0; i < 5; ++i) {
			System.out.println("i: " + i);
		}

		System.out.println("");
		System.out.println("condicion true 4 >= 0; --i ");
		for ( int i = 4; i >= 0; --i) {
			System.out.println("i: " + i);
		}

		System.out.println("");
		System.out.println("muchas inicializaciones");
		for ( int i = 4, j = 0, x = 10; i >= 0 && j > -3; --i, x++, j--) {
			System.out.println("i: " + i + " j: " + j + " x: " + x);
		}
	}
	
	void testForEach(int num) { 

		System.out.println("");
		System.out.println("*** testForEach ***");

		System.out.println("");
		System.out.println("condicion false 10 < 5");

		int[] list = {1,2,3,4,5};


		for ( int b : list) {
			System.out.println(b);
		}

		System.out.println("");
		System.out.println("mezcla foreach, for");
		
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		for(int[] mySimpleArray : myComplexArray) {
			for(int i=0; i < mySimpleArray.length; i++) {
				System.out.print(mySimpleArray[i]+ "\t");
			}
			System.out.println();
		}

	}
}