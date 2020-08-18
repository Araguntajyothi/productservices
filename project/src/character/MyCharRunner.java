package character;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('B');

		System.out.println(myChar.isVowel());
		// 'a','e','i','o','u' and capitals
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isConsonant());
		MyChar.printLowerCaseAlphabets();// static method
		MyChar.printUpperCaseAlphabets();

	}

}
