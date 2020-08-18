package constructors;//encapsultion example

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book artOfComputerProgramming = new Book(1000);
		Book effectiveJava = new Book(800);
		Book cleanCode = new Book(400);
		Book javaCode = new Book();

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
		System.out.println(javaCode.getNoOfCopies());

		// artOfComputerProgramming.setNoOfCopies(100);

		artOfComputerProgramming.increaseNoOfCopies(100);
		effectiveJava.increaseNoOfCopies(70);
		cleanCode.increaseNoOfCopies(40);

		artOfComputerProgramming.decreaseNoOfCopies(50);
		effectiveJava.decreaseNoOfCopies(50);
		cleanCode.decreaseNoOfCopies(50);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

	}

}
