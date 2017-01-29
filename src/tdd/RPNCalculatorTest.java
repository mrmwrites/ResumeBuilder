package tdd;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class RPNCalculatorTest extends TestCase {

	RPNCalculator rpnCalcultor;
	
	@Test
	public void test2OperandsAndOperator()
	{
		RPNCalculator rpnCalcultor = new RPNCalculator();
		assertEquals(5, rpnCalcultor.calculate("23+"));
		rpnCalcultor.calculate11("2,3,+");
		rpnCalcultor.calculate11("3,2,-");
		rpnCalcultor.calculate11("2,3,*");
		rpnCalcultor.calculate11("2,4,/");
		
	}


	@Test
	public void testCheckLength()
	{
		RPNCalculator rpnCalcultor = new RPNCalculator();
		assertEquals(true, rpnCalcultor.calculatetwovalues("23+"));
		assertEquals(false, rpnCalcultor.calculatetwovalues("2+"));
		assertEquals(false, rpnCalcultor.calculatetwovalues("2"));
		assertEquals(false, rpnCalcultor.calculatetwovalues(null));
		assertEquals(false, rpnCalcultor.calculatetwovalues(""));
		assertEquals(false, rpnCalcultor.calculatetwovalues("245+"));	
		assertEquals(true, rpnCalcultor.calculatetwovalues("245++"));	
		
	}
	
	@Test
	public void testGivenExpression()
	{
		RPNCalculator rpnCalcultor = new RPNCalculator();
		assertEquals(true, rpnCalcultor.calculatetwovalues("23+"));
		assertEquals(false, rpnCalcultor.calculatetwovalues("2+"));
		assertEquals(false, rpnCalcultor.calculatetwovalues("2"));
		assertEquals(false, rpnCalcultor.calculatetwovalues(null));
		assertEquals(false, rpnCalcultor.calculatetwovalues(""));
		assertEquals(false, rpnCalcultor.calculatetwovalues("245+"));	
		assertEquals(true, rpnCalcultor.calculatetwovalues("245++"));	
		
	}
		
	
	@Test
	public void test2OperandsAndAddOperator()
	{
		RPNCalculator rpnCalcultor = new RPNCalculator();
		System.out.println("rpnCalcultor.calculate1 23+ "+rpnCalcultor.calculate1("23+"));
		assertEquals(5, rpnCalcultor.calculate1("23+"));
		assertEquals(6, rpnCalcultor.calculate1("42+"));
		System.out.println("rpnCalcultor.calculate1 42+ "+rpnCalcultor.calculate1("42+"));
		
	}
	
	
	@Test
	public void test2OperandsAndSubOperator()
	{
		RPNCalculator rpnCalcultor = new RPNCalculator();
		assertEquals(-1, rpnCalcultor.calculate1("23-"));
		System.out.println("rpnCalcultor.calculate1 23- "+rpnCalcultor.calculate1("23-"));
	}
	
	@Test
	public void test2OperandsAndMulOperator()
	{
		RPNCalculator rpnCalcultor = new RPNCalculator();
		assertEquals(6, rpnCalcultor.calculate1("23*"));
		System.out.println("rpnCalcultor.calculate1 23* "+rpnCalcultor.calculate1("23*"));
	}
	
	@Test
	public void test2OperandsAndDivOperator()
	{
		RPNCalculator rpnCalcultor = new RPNCalculator();
		assertEquals(2, rpnCalcultor.calculate1("42/"));
		System.out.println("rpnCalcultor.calculate1 42/ "+rpnCalcultor.calculate1("42/"));
	}
	
	
	@Test
	public void test1OperandAndOperator()
	{
		RPNCalculator rpnCalcultor = new RPNCalculator();
		boolean result = rpnCalcultor.checkFirstAndSecondTokens('2' , '+');
		assertEquals(false, result);
		//assertEquals(false, rpnCalcultor.calculate("2+"));
	}
	
	@Test
	public void testOperandAndOperatorResults()
	{
		RPNCalculator rpnCalcultor = new RPNCalculator();
		boolean result = rpnCalcultor.calculatetwovalues("23+");
		assertEquals(true, result);
		//assertEquals(false, rpnCalcultor.calculate("2+"));
	}
	
	@Test
	public void testCheckLengthOfExpression()
	{
		RPNCalculator rpnCalcultor = new RPNCalculator();
		String expression ="23+";
		
		boolean result = rpnCalcultor.calculatetwovalues(expression);
		assertEquals(true, result);
		
		 
		
		boolean result1 = rpnCalcultor.calculatetwovalues("24+");
		assertEquals(true, result1);
	}
	
	
	 
		
	char op1;
	char op2;
	
	/** * Initialization */
	@Before
	public void setUp() {
		rpnCalcultor =  new RPNCalculator();
	}
	
	@Test
	public void checkFirstAndSecondTokens()
	{
		boolean result = rpnCalcultor.checkFirstAndSecondTokens('4','5');
		Assert.assertTrue("Both Tokens are digits", result);
	}
	
	/*@Test
	public void checkFirstThreeTokens(char op1, char op2, char op3)
	{
				
	}*/
	
}
