// Import all JUnit libraries
import org.junit.jupiter.api.*;
// Import all JUnit assertions as a static import
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
	
	Calculator calc;
	
	// Annotation to tell JUnit to do this before each test
	@BeforeEach
	void setup() {
		calc = new Calculator();
	}
	
	// Annotation to run test
	@Test
	@DisplayName("Addition Test")
	void testAdd() {
		assertEquals(15, calc.add(10, 5), "Addition does not work correctly");
		assertEquals(16, calc.add(12, 4), "Addition does not work correctly");
		assertEquals(10, calc.add(5, 5), "Addition does not work correctly");
	}
	
	@Test
	@DisplayName("Multiply Test")
	void testMultiply() {
		assertTrue(calc.multiply(6, 5) == 30, "Answer of 6 * 5 is wrong");
	}
	
	@Test
	@Disabled("Not implemented yet")
	@DisplayName("Subtraction Test")
	void testSubtraction() {
		assertThrows(UnsupportedOperationException.class, () -> {
			calc.subtract(3, 1);
		});
	}
	
}
