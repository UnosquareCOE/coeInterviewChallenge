package algorithms;

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

	/**
	 * Reverses a string
	 * @param stringToReverse
	 * @return reversed string
	 */
	static String reverseString(final String stringToReverse) {
		
		// Ensuring that a null pointer exception won't be thrown
		if(stringToReverse==null) {
			return stringToReverse;
		}
		
		// Use string builder instead of concatenating string (better performance)
		StringBuilder sb = new StringBuilder();
		
		// I could also use sb.reverse() but it feels a bit like cheating :)
		for (int i = stringToReverse.length() - 1; i >= 0; i--) {
			sb.append(stringToReverse.charAt(i));
		}
		return sb.toString();
	}

}