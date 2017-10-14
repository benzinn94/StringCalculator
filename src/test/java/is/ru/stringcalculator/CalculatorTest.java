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
		assertEquals(2, StringCalculator.add("2"));
	}

	@Test
	public void testTwoNumbers(){
		assertEquals(2, StringCalculator.add("1,1"));
		assertEquals(3, StringCalculator.add("1,2"));
		assertEquals(4, StringCalculator.add("2,2"));
	}

	@Test
	public void testMultipleNumbers(){
		assertEquals(300, StringCalculator.add("100,50,40,10,60,20,20"));
	}

	@Test
	public void testWithNewLines(){
		assertEquals(10, StringCalculator.add("1\n2,7"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNegativeNumbers(){
		StringCalculator.add("-1,-3,-5,6");
	}

	@Test
	public void checkNumbersAboveThousand(){
		assertEquals(1025, StringCalculator.add("10,1009,1005,1000,15"));
	}

	@Test
	public void testNewDelimeter(){
		assertEquals(4,StringCalculator.add("//;,1,1;1;1"));
		
	}

}