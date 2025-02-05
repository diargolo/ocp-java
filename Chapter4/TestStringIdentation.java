public class TestStringIdentation { 

		public static void main (String[] args) {


		System.out.println("*** Main ***");


		TestStringIdentation tsi = new TestStringIdentation();

		tsi.testStringIdentation("test");


	}

	void testStringIdentation(String value) { 

		System.out.println("");
		System.out.println("*** testStringIdentation ***");

		var block = """
					a
					 b
					c""";
		
		var concat = " a\n"
				   + "  b\n"
				   + " c";

		System.out.println("** block **");
		showBracket(block);
		System.out.print(" - length: ");
		System.out.print(block.length()); // 6

		System.out.println("\n\n** concat **");
		showBracket(concat);
		System.out.print(" - length: ");
		System.out.print(concat.length()); // 9

		System.out.println("\n\n** block **");
		showBracket(block,".indent(1)");
		System.out.println(" -> ");
		showBracket(block.indent(1),"");
		System.out.print(" - length: ");
		System.out.print(block.indent(1).length()); // 10

		System.out.println("\n\n** concat **");
		showBracket(concat,".indent(-1)");
		System.out.println(" -> ");
		showBracket(concat.indent(-1),"");
		System.out.print(" - length: ");
		System.out.print(concat.indent(-1).length()); // 7

		System.out.println("\n\n** concat **");
		showBracket(concat,".indent(-4)");
		System.out.println(" -> ");
		showBracket(concat.indent(-4),"");
		System.out.print(" - length: ");
		System.out.print(concat.indent(-4).length()); // 6


		System.out.println("\n\n** concat **");
		showBracket(concat,".indent(-10)");
		System.out.println(" -> ");
		showBracket(concat.indent(-10),"");
		System.out.print(" - length: ");
		System.out.print(concat.indent(-10).length()); // 6

		System.out.println("\n\n** concat **");
		showBracket(concat,".stripIndent()");
		System.out.println(" -> ");
		showBracket(concat.stripIndent(),"");
		System.out.print(" - length: ");
		System.out.print(concat.stripIndent().length()); // 6
		System.out.println("");
		System.out.println("");

	}

	void showBracket(String v1) {
		System.out.print("\"" + v1 + "\"");
	}

	void showBracket(String v1, String v2) {
		System.out.print("\"" + v1 + "\"" + v2);
	}
}