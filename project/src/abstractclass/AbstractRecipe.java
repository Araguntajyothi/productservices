package abstractclass;

public abstract class AbstractRecipe {
	// execute is non abstract method
	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}

	// these are abstract methods
	abstract void getReady();

	abstract void doTheDish();

	abstract void cleanup();


}
