package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class CalculatorTest{

	@Test
	public void testEmptyString(){
		assertEquals(0, StringCalculator.add(""));
	}

	@Test
	public void testOneNumber(){
		assertEquals(1, StringCalculator.add("1"));
	}

	@Test
	public void testTwoNumbers(){
		assertEquals(2, StringCalculator.add("1,1"));
	}
}