package algorithms;


import java.util.List;

public class Algorithms {

  // README:
  // Uncomment one of the methods below and add an implementation

//  static int countOddNumbersInCollection(final List<Integer> integerList)
//  {
//
//  }

    // method to add together the even numbers from a collection and calculate the total
    static int calculateSumOfEvenNumbersInCollection(final List<Integer> integerList) {
        int total = 0;
        for (int i = 0; i < integerList.size(); i++ ) {
            if (integerList.get(i) % 2 == 0) {
                total += integerList.get(i);
            }
        }
        return total;
    }

//  static String reverseString(final String stringToReverse)
//  {
//
//  }

}
