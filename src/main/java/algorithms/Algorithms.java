package algorithms;
//List not required for the reverse string using StingBuilder

//import java.util.List;

public class Algorithms {

	// README:
	// Uncomment one of the methods below and add an implementation

//  static int countOddNumbersInCollection(final List<Integer> integerList)
//  {
//
//  }

//  static int calculateSumOfEvenNumbersInCollection(final List<Integer> integerList)
//  {
//
//  }

	static String reverseString(final String stringToReverse) {
		// vars
		StringBuilder rString = new StringBuilder();
		int stringLength = stringToReverse.length();

		for (int loop = (stringLength - 1); loop >= 0; loop--) {
			rString.append(stringToReverse.charAt(loop));
		}

		return rString.toString();
	}

}
