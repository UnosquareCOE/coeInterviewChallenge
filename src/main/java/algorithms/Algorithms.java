package algorithms;
import java.util.List;
public class Algorithms {

  // README:
  // Uncomment one of the methods below and add an implementation

  // method to determine number of odd integers in a collection
  static int countOddNumbersInCollection(final List<Integer> integerList) {
    int oddCount;
    oddCount = 0;
    for (int i : integerList) {
      if (i % 2 == 1) {
        oddCount++;
      }
    }
    return oddCount;
  }

  // static int calculateSumOfEvenNumbersInCollection(final List<Integer>
  // integerList)
  // {
  //
  // }

  // static String reverseString(final String stringToReverse)
  // {
  //
  // }

}
