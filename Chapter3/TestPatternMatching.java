public class TestPatternMatching { 

		public static void main (String[] args) {


		System.out.println("*** Main ***");


		TestPatternMatching pm = new TestPatternMatching();
		pm.instanceOf_(10);
		pm.instanceOf_((long)11);
		pm.instanceOf_( Long.valueOf(12));
		pm.instanceOf_( Double.valueOf(1));



		pm.instanceOf_((long)5);



	}

	void instanceOf_(Number num) {

		System.out.println("*** instanceOf_ ***");

		if (num instanceof Integer i) {
			i++;
			System.out.println("Integer type: " + i );
		} else if (num instanceof Long l) {
			l++;
			System.out.println("Long type compare: " + l.compareTo(5L) );
		} else {

			System.out.println("Other type: " + num );
		}

		if (num instanceof Integer l1 && l1.compareTo(5) < 2) {
			l1++;
			System.out.println("   Integer ( compare < 2 ): " + l1);
		}

	}
}