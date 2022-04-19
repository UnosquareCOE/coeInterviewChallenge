package algorithms;


import java.util.List;

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
   * Reverses String. For loop iterates through stringtoReverse in reverse, adding char to the new string, reversed, to be returned 
   * @param stringToReverse
   * @return
   */
  static String reverseString(final String stringToReverse) {
    String reversed = "";

    for (int i = stringToReverse.length() - 1; i >= 0; --i) {
      reversed += stringToReverse.charAt(i);
    }

    return reversed;
  }

}
