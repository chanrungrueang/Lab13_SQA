import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
class DemoTest {
	FizzBuzz fb = new FizzBuzz();
	@Test
	void Fizztest() {
		String txt = fb.convert(3);
		assertEquals("Fizz",txt);
	}
}