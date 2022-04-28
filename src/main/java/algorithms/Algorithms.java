package algorithms;


import java.util.List;

public class Algorithms {

  // README:
  // Uncomment one of the methods below and add an implementation

  static int countOddNumbersInCollection(final List<Integer> integerList) {
	  int count = 0;
	  
	  for (Integer number : integerList) {
		  if (number % 2 == 1) {
			  count++;
		  }
	  }
	  
	  return count;
  }

//  static int calculateSumOfEvenNumbersInCollection(final List<Integer> integerList) {
//	  int total = 0;
//	  
//	  for (Integer number : integerList) {
//		  if (number % 2 == 0){
//			total += number;  
//		  }
//	  }
//	  return total;
//  }

//  static String reverseString(final String stringToReverse)
//  {
//
//  }

}
