package algorithms;


import java.util.List;

public class Algorithms {

  // README:
  // Uncomment one of the methods below and add an implementation

 static int countOddNumbersInCollection(final List<Integer> integerList)
 {
      int oddNumberCount = 0; 

      for(int i = 0; i < integerList.size(); i++) {
        int checkNumber = integerList.get(i);
        if(checkNumber % 2 == 1)  {
          oddNumberCount++;
        }
      }
      return oddNumberCount;
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
