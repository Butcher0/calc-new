package cucumber.examples.java.helloworld;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void testSetNumber() {

		Calculator calc = new Calculator();
		calc.setNumbers(2);
		calc.setNumbers(3);
		assertEquals(5, calc.getTall1() + calc.getTall2());
	}

}