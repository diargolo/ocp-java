public class TestString { 

		public static void main (String[] args) {


		System.out.println("*** Main ***");


		TestString ts = new TestString();

		ts.testString("test");


	}

	void testString(String value) { 

		System.out.println("");
		System.out.println("*** testString ***");

		String a0 = "test";
		String a1 = new String("test");
		String a2 = """
					test""";

		System.out.println("a0: " + a0);
		System.out.println("a1: " + a1);
		System.out.println("a2: " + a2);

		System.out.println("a0 == a1: " + (a0 == a1));
		System.out.println("a0 == a2: " + (a0 == a2));
		System.out.println("a1 == a2: " + (a1 == a2));


		int three = 3;
		String four = "4";
		System.out.println("1 + 2 + three + four: " + (1 + 2 + three + four));
	}
}