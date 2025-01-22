package packagetest;

class TestTextBlocks {
	

	public static void main(String[] args) {


		System.out.println("desde main");
		System.out.println("*******");
		int a = 10;

		String block1 = """
		linea 1 \n \
		 linea 2 + a +
			linea 3
		""";
		System.out.println("block1: " + block1);


		System.out.println("*******");

		String block2 = """
		linea 1  """;
		System.out.println("*** block2: " + block2 + "****");


	}

}
