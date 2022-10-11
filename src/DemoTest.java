

import static org.junit.Assert.assertEquals;

import org.junit.Test;
class DemoTest {
	FizzBuzz fb = new FizzBuzz();
	@Test
	void Fizztest() {
		String txt = fb.convert(3);
		assertEquals("Fizz",txt);
	}
	@Test
	void Buzztest() {
		String txt = fb.convert(5);
		assertEquals("Buzz",txt);
	}
}
