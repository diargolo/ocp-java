public class TestString { 

		public static void main (String[] args) {


		System.out.println("*** Main ***");


		TestString ts = new TestString();

		ts.testString("test");
		ts.testStringWhiteSpaces("test");


	}

	void testString(String value) { 

		System.out.println("");
		System.out.println("*** testString ***");

		String a0 = "test";
		String a1 = new String("test");
		String a2 = """
					test""";
		String a3 = "TEST";

		System.out.println("a0: " + a0);
		System.out.println("a1: " + a1);
		System.out.println("a2: " + a2);
		System.out.println("a3: " + a3);

		System.out.println("");
		System.out.println("a0 == a1: " + (a0 == a1));
		System.out.println("a0 == a2: " + (a0 == a2));
		System.out.println("a0 == a3: " + (a0 == a3));
		System.out.println("a1 == a2: " + (a1 == a2));

		System.out.println("");
		System.out.println("a0 equals a1: " + (a0.equals(a1)));
		System.out.println("a0 equals a2: " + (a0.equals(a2)));
		System.out.println("a0 equals a3: " + (a0.equals(a3)));
		System.out.println("a1 equals a2: " + (a1.equals(a2)));

		System.out.println("");
		System.out.println("a0 equalsIgnoreCase a3: " + (a0.equalsIgnoreCase(a3)));

		int three = 3;
		String four = "4";
		System.out.println("");
		System.out.println("1 + 2 + three + four: " + (1 + 2 + three + four));

	}

	void testStringWhiteSpaces(String value) { 

		System.out.println("");
		System.out.println("*** testStringWhiteSpaces ***");

		System.out.println("");
		showBracket("abc", ".strip()");
		System.out.print(" -> ");
		showBracket("abc".strip(),""); // a b c

		System.out.println("");
		showBracket("\\t      a b c\\n", ".strip()");
		System.out.print(" -> ");
		showBracket("\t      a b c\n".strip(),""); 

		//System.out.println("");
		String text = " abc\t ";
		//showBracket(text,"");

		System.out.println("");
		showBracket(text,".trim()");
		System.out.print(" -> ");
		showBracket(text.trim(),"");
		System.out.print(" - length: ");
		System.out.print(text.trim().length()); // 3

		System.out.println("");
		showBracket(text,".strip()");
		System.out.print(" -> ");
		showBracket(text.strip(),"");
		System.out.print(" - length: ");
		System.out.print(text.strip().length()); // 3

		System.out.println("");
		showBracket(text,".stripLeading()");
		System.out.print(" -> ");
		showBracket(text.stripLeading(),"");
		System.out.print(" - length: ");
		System.out.print(text.stripLeading().length()); // 5

		System.out.println("");
		showBracket(text,".stripTrailing()");
		System.out.print(" -> ");
		showBracket(text.stripTrailing(),"");
		System.out.print(" - length: ");
		System.out.print(text.stripTrailing().length()); // 4

		System.out.println("");
		System.out.println("");

	}

	void showBracket(String v1, String v2) {
		System.out.print("\"" + v1 + "\"" + v2);
	}
}