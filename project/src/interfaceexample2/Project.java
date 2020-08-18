package interfaceexample2;

public class Project {
	// when u r providing the interface some other third party providing
	// implementation for u in these kind of situations having default method is
	// very very useful
	interface Test {
		void nothing();

		default void nothing1() {

		}
	}

	class Class1 implements Test {

		@Override
		public void nothing() {

		}

	}

	class Class2 implements Test {

		@Override
		public void nothing() {

		}

	}

	public static void main(String[] args) {
		ComplexAlgorithm algorithm = new RealAlgorithm();
		System.out.println(algorithm.complexAlgorithm(10, 20));
	}

}
