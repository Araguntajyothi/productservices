package abstractclass;

//abstract class allows us to do basic algorithm
public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Switch on the microwave");
	}

	@Override
	void doTheDish() {
		System.out.println("get stuff ready");
		System.out.println("put in the microwave");

	}

	@Override
	void cleanup() {
		System.out.println("cleanup the utensils");
		System.out.println("Switch off the microwave");
	}

}
