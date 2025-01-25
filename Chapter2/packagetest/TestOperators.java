package packagetest;

public class TestOperators {
	

	public static void main (String[] args) {


		System.out.println("*** Desde main");


		TestOperators tp = new TestOperators();
		tp.operators();
		tp.complemet();


	}

	void operators() {

		System.out.println("*** Desde operators");

		int value1 = 10, value2 = 10;
		System.out.println("value1:" +  value1);
		System.out.println("value1++:" +  value1++);
		System.out.println("value1:" +  value1);

		System.out.println("value2:" + value2);
		System.out.println("++value2:" + ++value2);

		System.out.println("");


	}

		void complemet() {

		System.out.println("*** Desde complemet");

		int value = 3;

		System.out.println("value:" +  value);
		System.out.println("~value:" +  ~value);

		System.out.println("");
	}

}