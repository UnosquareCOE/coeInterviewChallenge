package shapes;

//import static org.hamcrest.CoreMatchers.is;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class RectangleTest {

  private static final double WIDTH = 5;
  private static final double HEIGHT = 8;
  private Shape rectangle;

  @Before
  public void setup() {
    rectangle = new Rectangle(WIDTH, HEIGHT);
  }

  @Test
  public void calculate_area_returns_expected_result() {
    final double area = WIDTH * HEIGHT;
    assertThat(rectangle.calculateArea()).isEqualTo(area);

  }

  @Test
  public void calculate_perimeter_returns_expected_result() {
    final double perimeter = (2 * WIDTH) + (2 * HEIGHT);
    assertThat(rectangle.calculatePerimeter()).isEqualTo(perimeter);
  }
}
