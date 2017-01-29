package test.java;

import junit.framework.*;

public class TestRPN extends TestCase{
	public void test2operandAnd1Operator()
	{
		RpnCalc rpn = new RpnCalc();
		assertEquals(1, rpn.calculate("3,2,-"));
	}
}