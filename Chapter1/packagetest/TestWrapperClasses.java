package packagetest;

class TestWrapperClasses {
	
	public static void main(String[] args) {
		
		System.out.println("Desde main");


		TestWrapperClasses test = new TestWrapperClasses();
		test.testWrappers();



	}

	void testWrappers() {

		// No compila
		//boolean bool = Boolean.valueOf(1);
		//long largo = Long.parseLong("123");

		boolean bool = Boolean.valueOf("1");
		System.out.println("bool: " + bool);

		bool = Boolean.valueOf("TrUe");
		System.out.println("bool: " + bool);

		long largo = Long.parseLong("123");
		System.out.println("largo: " + largo);

		Long largo1 = Long.parseLong("123");
		System.out.println("largo1: " + largo1);

		int intPrimitive = Integer.parseInt("123");
		System.out.println("intPrimitive: " + intPrimitive);

		Integer intNotPrimitive = Integer.parseInt("123");
		System.out.println("intNotPrimitive: " + intNotPrimitive);
	}
}