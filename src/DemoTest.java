import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

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
	@Test
	void FizzBuzztest() {
		String txt = fb.convert(15);
		assertEquals("FizzBuzz",txt);
	}
	@Test
	void inttest() {
		String txt = fb.convert(1);
		assertEquals("1",txt);
	}
	@ParameterizedTest
	@CsvFileSource(files = "src/Num1-100.csv",numLinesToSkip = 1)
	void FizzBuzzTest100(int num, String expect) {
		assertEquals(expect, fb.convert(num));
		
	}
	
}
