package book;//encapsultion example

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.setNoOfCopies(100);

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
