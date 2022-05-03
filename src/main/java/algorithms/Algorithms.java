package algorithms;

import java.util.List;

public class Algorithms {

	// README:
	// Uncomment one of the methods below and add an implementation

	static int countOddNumbersInCollection(final List<Integer> integerList) {
		int oddNumbers = 0;
		// extract all from List using that funny Java/PHP syntax
		for (Integer allNumbers : integerList) {
			// get odd numbers using modulus to find remainders
			if (allNumbers % 2 == 1) {
				oddNumbers++;
			}
		}
		System.out.println("OddNumbers found: " + oddNumbers);
		return oddNumbers;
	}

//  static int calculateSumOfEvenNumbersInCollection(final List<Integer> integerList)
//  {
//
//  }

//  static String reverseString(final String stringToReverse)
//  {
//
//  }

}
