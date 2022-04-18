package shapes;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CircleTest {

  private static final double RADIUS = 5;
  private Shape circle;

  @Before
  public void setup() {
    circle = new Circle(RADIUS);
  }

  @Test
  public void calculate_area_returns_expected_result() {

    final double area = RADIUS * RADIUS * Math.PI;

    assertThat(circle.calculateArea()).isEqualTo(area);
  }

  @Test
  public void calculate_perimeter_returns_expected_result() {
    final double perimeter = RADIUS * 2 * Math.PI;
    assertThat(circle.calculatePerimeter()).isEqualTo(perimeter);
  }
}
