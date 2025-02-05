public class TestStringFormat { 

		public static void main (String[] args) {


		System.out.println("*** Main ***");


		TestStringFormat tsf = new TestStringFormat();

		tsf.testStringFormat("test");


	}

	void testStringFormat(String value) { 

		System.out.println("");
		System.out.println("*** TestStringFormat ***");

		var name = "Kate";
		var orderId = 5;

		System.out.println("Hello " + name + ", order " + orderId + " is ready");
		System.out.println(String.format("Hello %s, order %d is ready", name, orderId));
		System.out.println("Hello %s, order %d is ready".formatted(name, orderId));

		System.out.print("\n");
		var pi = 3.14159265359;
		System.out.format("[%f]",pi); // [3.141593]

		System.out.print("\n");
		System.out.format("[%12.8f]",pi); // [ 3.14159265]

		System.out.print("\n");
		System.out.format("[%012f]",pi); // [00003.141593]

		System.out.print("\n");
		System.out.format("[%12.2f]",pi); // [ 3.14]
		
		System.out.print("\n");
		System.out.format("[%.3f]",pi); // [3.142]

		System.out.print("\n");
		System.out.print("\n");
	}
}