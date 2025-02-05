public class TestLabels { 

		public static void main (String[] args) {


		System.out.println("*** Main ***");


		TestLabels tl = new TestLabels();

		tl.testOptionalLabel(5);
		tl.testContinue(5);


	}

	void testOptionalLabel(int num) { 

		System.out.println("");
		System.out.println("*** testOptionalLabel ***");

		System.out.println("");
		System.out.println("LABELS");

		int[][] myComplexArray = {{5,2,1,3},{3,9,-1,9},{5,7,12,7},{1},{6,3,4,8}};
		OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {

			if(mySimpleArray.length < 2) {
				break OUTER_LOOP;
			}

			INNER_LOOP: for(int i=0; i < mySimpleArray.length; i++) {
				if(mySimpleArray[i] < 0) {
					break INNER_LOOP;
				}
				System.out.print(mySimpleArray[i]+ "\t");
			}
			System.out.println();
		}
	}

		void testContinue(int num) { 

		System.out.println("");
		System.out.println("*** testContinue ***");

		System.out.println("");
		System.out.println("Continue");

		int[][] myComplexArray = {{5,2,1,3},{3,9,-1,9},{5,7,12,7},{1},{6,3,4,8}};
		OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {

			if(mySimpleArray.length < 2) {
				continue OUTER_LOOP;
			}

			INNER_LOOP: for(int i=0; i < mySimpleArray.length; i++) {
				if(mySimpleArray[i] < 0) {
					continue INNER_LOOP;
				}
				System.out.print(mySimpleArray[i]+ "\t");
			}
			System.out.println();
		}
	}
}