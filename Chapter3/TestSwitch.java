public class TestSwitch { 

		public static void main (String[] args) {


		System.out.println("*** Main ***");


		TestSwitch ts = new TestSwitch();

		ts.testSwitchStatement(5);
		ts.testSwitchExpression(1);
		ts.testSwitchExpression(3);
		ts.testSwitchExpression(5);
		

	}

	void testSwitchStatement(int num) { 

		System.out.println("** Java 13 and Previus **");
		switch(num) {
			case 1: case 2: System.out.println("case 1: case 2:");
			case 3: case 4: System.out.println("case 3, case 4:");
			case 5: case 6: System.out.println("case 5, case 6:");

		}

		System.out.println("");
		System.out.println("** Java 14 sin brake ( match al ultimo ) **");
		final int trece = 13;
		switch(num) {
			case 1,2: System.out.println("value: 1,2");
			default: System.out.println("Unknown");
			case 3,4: System.out.println("value: 3,4");
			case trece: System.out.println("value: 13");  
			case 2*5: System.out.println("value: 2*5");  
			case 5,6: System.out.println("value: 5,6");

		}

		System.out.println("");
		System.out.println("** test issue 14 **");

		switch(num) {
			// si hace match, imprime todos los valores que siguen, por eso se debe usar break
			case 1, 2, 3: System.out.println("Winter");
			case 4, 5, 6: System.out.println("Spring");
			default: System.out.println("Unknown");
			case 7, 8, 9: System.out.println("Summer");
			case 10, 11, 12: System.out.println("Fall");
		}

		System.out.println("");
		System.out.println("** fix issue 14 con brake **");
		switch(num) {
			// con break
			case 1, 2, 3: System.out.println("Winter");break;
			case 4, 5, 6: System.out.println("Spring");break;
			default: System.out.println("Unknown");break;
			case 7, 8, 9: System.out.println("Summer");break;
			case 10, 11, 12: System.out.println("Fall");break;
		}

	}

	void testSwitchExpression(int num) { 

		System.out.println("");	
		System.out.println("** Switch Expression **");

		int a = switch(num) {
			case 1, 2 -> 12;
			case 3, 4 -> {
				yield 34;
			}
			case 5,6 -> {
				if(num == 5) { 
					yield 5; 
				 } else { 
				 	yield 6; 
				 }
			}
			default -> 0; 
		};

		System.out.println("a:" + a);

		System.out.println("");	
		System.out.println("** Switch enum **");

		enum Season {WINTER, SPRING, SUMMER, FALL};
		Season s = Season.SPRING;
		String s1 = switch(s) {
			case WINTER -> "Cold";
			case SPRING -> "Rainy";
			case SUMMER -> "Hot";
			case FALL -> "Warm";
		};
		System.out.println("s1:" + s1);

	}
}