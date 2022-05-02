package algorithms;

//import java.util.List;

/**
 * Algorithms class
 * 
 */
public class Algorithms {

	// README:
	// Uncomment one of the methods below and add an implementation

	// static int countOddNumbersInCollection(final List<Integer> integerList)
	// {
	//
	// }

	// static int calculateSumOfEvenNumbersInCollection(final List<Integer>
	// integerList)
	// {
	//
	// }

	/**
	 * Reverses a string
	 * 
	 * @param stringToReverse
	 * @return
	 */
	static String reverseString(final String stringToReverse) {

		if (stringToReverse.length() == 1) {
			// base case
			return stringToReverse;
		}
		return reverseString(stringToReverse.substring(1)) + stringToReverse.charAt(0);
	}

}
