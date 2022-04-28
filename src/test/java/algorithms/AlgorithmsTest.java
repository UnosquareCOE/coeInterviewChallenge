package algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.Matchers.not
//import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
//import org.assertj.core.util.Lists;
import org.junit.Test;

import org.junit.Assert;

public class AlgorithmsTest {

  // README:
  // Uncomment the method below that is appropriate to the implementation that was chosen in the
 //  Algorithms class

  @Test
  public void calculateCountOfOddNumbersInCollection_returns_expected_result() {
    final List<Integer> integerList = List.of(1, 3, 5, 3, 2, 9);
    assertThat(Algorithms.countOddNumbersInCollection(integerList), is(equalTo(5)));
  }

//  @Test
//  public void calculateSumOfEvenNumbersInCollection_returns_expected_result() {
//    final List<Integer> integerList = List.of(2, 9, 11, 1, 5, 6);
//    assertEquals(Algorithms.calculateSumOfEvenNumbersInCollection(integerList), 8);
//  }

//  @Test
//  public void reverseString_returns_expected_result() {
//    final String stringToReverse = "A String to Reverse";
//    assertThat(Algorithms.reverseString(stringToReverse)).isEqualTo("esreveR ot gnirtS A");
//  }

}
