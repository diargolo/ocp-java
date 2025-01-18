package packagetest;

public class Test {

	int iTest;
	String sTest;

	{ 
		System.out.println("** Desde Bloque class **");
	}

	public final static void main(String[] args)
	{
		System.out.println("Hola Mundo");
		System.out.println(args[0]);

		{ 
			System.out.println("** Desde main method **");
		}

		Test test = new Test();
		test.imprimir();

	}

	void imprimir() {
		System.out.println("Desde imprimir");
		System.out.println("iTest: " + iTest);
		System.out.println("sTest: " + sTest);

		{ 
			System.out.println("** Desde imprimir method **");
		}
		
	}
}