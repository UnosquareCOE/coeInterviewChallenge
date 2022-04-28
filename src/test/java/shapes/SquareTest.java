package shapes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SquareTest {

  private static final double SIDE = 7;
  private Shape square;

  @Before
  public void setup() {
    square = new Square(SIDE);
  }

  @Test
  public void calculate_area_returns_expected_result() {
    final double area = SIDE * SIDE;
    assertThat(square.calculateArea(), is(equalTo(area)));
  }

  @Test
  public void calculate_perimeter_returns_expected_result() {
    final double perimeter = SIDE * 4;
    assertThat(square.calculatePerimeter(), is(equalTo(perimeter)));
  }
}
