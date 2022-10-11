import static org.junit.jupiter.api.Assertions.*;

class Test {
	FizzBuzz fb = new FizzBuzz();
	@Test
	void Fizztest() {
		String txt = fb.convert(3);
		assertEquals("Fizz",txt);
	}
}