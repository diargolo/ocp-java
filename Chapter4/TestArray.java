
import java.util.Arrays;

public class TestArray { 

		public static void main (String[] args) {


		System.out.println("*** Main ***");


		TestArray ta = new TestArray();

		ta.testArray("test");
		ta.testCompare("test");
		ta.testMismatch("test");


	}

	void testArray(String value) { 

		System.out.println("");
		System.out.println("*** testArray ***");

		int[] list = new int[] {1,2,3,4,5,6,7,8,9,0};
		int[] list1 = {1,2,3,4,5,6,7,8,9,0};

		int[] list2 = {1,2,3,4,5,6,7,8,9,0};
		showArray(list2);

		System.out.println("");
		Arrays.sort(list2);
		showArray(list2);

		System.out.println("");
		int[] list3 = {1,2,3,4,5,6,7,8,9};
		showArray(list3);
		int pos = Arrays.binarySearch(list3, 5);
		System.out.println("");
		System.out.println(pos);

		pos = Arrays.binarySearch(list3, 12);
		System.out.println("");
		System.out.println(pos);

		System.out.println("");
		System.out.println("");
	}

	void testCompare(String value) { 

		System.out.println("");
		System.out.println("*** testCompare ***");

		int[] array = new int[] {1,2,3,4,5,6,7,8};
		int[] menor = {1,2,3,4,5,6,7};
		int[] mayor = {1,2,3,4,5,6,7,8,9};

		System.out.print("array : ");
		showArray(array);
		
		System.out.print("menor : ");
		showArray(menor);

		System.out.print("mayor : ");
		showArray(mayor);

		System.out.println("");
		System.out.println("compare(array, array): " + Arrays.compare(array, array));
		System.out.println("compare(menor, mayor): " + Arrays.compare(menor, mayor));
		System.out.println("compare(mayor, menor): " + Arrays.compare(mayor, menor));

	}

	void testMismatch(String value) { 

		System.out.println("");
		System.out.println("*** testMismatch ***");

		int[] array = new int[] {1,2,3,4,5,6,7,8};
		int[] menor = {1,2,3,4,5,6,7};
		int[] mayor = {1,2,3,4,5,6,7,8,9};

		System.out.print("array : ");
		showArray(array);
		
		System.out.print("menor : ");
		showArray(menor);

		System.out.print("mayor : ");
		showArray(mayor);

		System.out.println("");
		System.out.println("mismatch(array, array): " + Arrays.mismatch(array, array));
		System.out.println("mismatch(menor, mayor): " + Arrays.mismatch(menor, mayor));
		System.out.println("mismatch(mayor, menor): " + Arrays.mismatch(mayor, menor));

	}

	void showArray(int[] array) {
		StringBuilder text = new StringBuilder();
		text.append("[");

		for(var i: array) {
			text.append(i + ",");
		}

		text.replace(text.length()-1, text.length(), "]");
		System.out.println(text.toString());
	}
}