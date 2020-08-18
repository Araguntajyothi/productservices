package interfaceexample;

//interface basically represents actions that can be performed commonly
//interface provides us way to interchange  b/n implementations
public class GameRunner {

	public static void main(String[] args) {
		/*// MarioGame game = new MarioGame();//st1 and st3 get same o/p
		// ChessGame game = new ChessGame();//st2 and st4 get same o/p
		// GamingConsole game = new MarioGame();
		GamingConsole game = new ChessGame();
		game.up();
		game.down();
		game.left();
		game.right();
		*/
		// below code is related to polymorphism it applies to interface and abstract
		// classes
		GamingConsole[] games = {new MarioGame(),new ChessGame()};
		for(GamingConsole game:games) {
		game.up();
		game.down();
		game.left();
		game.right();
		}
	}

}
