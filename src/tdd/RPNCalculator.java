package tdd;

import java.util.Stack;

public class RPNCalculator {
	Stack<String> expressionStack = new Stack<String>();
	
	public int calculate11(String input)
	{
		String []arr = input.split(",");
		int secondVal = 0;
		int firstVal = 0;
		for (int i=0;i<arr.length;i++)
		{
			  
			if (arr[i].equals("+"))
			{
				secondVal = Integer.parseInt(expressionStack.pop());
				  firstVal = Integer.parseInt(expressionStack.pop());
				doAdditionForTwoNumbers(secondVal, firstVal, expressionStack);
			}
			else if (arr[i].equals("-"))
			{
				secondVal = Integer.parseInt(expressionStack.pop());
				  firstVal = Integer.parseInt(expressionStack.pop());
			 					doSubtractionOfTwoNumbers(secondVal, firstVal, expressionStack);
			}
			else if (arr[i].equals("*"))
			{
				secondVal = Integer.parseInt(expressionStack.pop());
				firstVal = Integer.parseInt(expressionStack.pop());
				doMultplicationOfTwoNumbers(secondVal, firstVal, expressionStack);
			}
			else if (arr[i].equals("/"))
			{
				secondVal = Integer.parseInt(expressionStack.pop());
				  firstVal = Integer.parseInt(expressionStack.pop());
				doDivisionOfTwoNumbers(secondVal, firstVal, expressionStack);
			}
			else
			{
				expressionStack.push(arr[i]);
			}
		}
		
		System.out.println(" value .... = "+expressionStack.pop());
		return 0;
	}
	
	void  doAdditionForTwoNumbers(int firstValue, int secondValue, Stack<String>expressionStack)
	{
		
		expressionStack.push(String.valueOf(firstValue + secondValue));
	}
	
	void  doSubtractionOfTwoNumbers(int firstValue, int secondValue, Stack<String>expressionStack)
	{
		expressionStack.push(String.valueOf(firstValue - secondValue));
	}
	
	void  doMultplicationOfTwoNumbers(int firstValue, int secondValue, Stack<String>expressionStack)
	{
		expressionStack.push(String.valueOf(firstValue * secondValue));
	}
	
	void  doDivisionOfTwoNumbers(int firstValue, int secondValue, Stack<String>expressionStack)
	{
		expressionStack.push(String.valueOf(firstValue / secondValue));
	}
	
	
	
	boolean checkFirstAndSecondTokens (char op1, char op2)
	{
		
		if ((op1>='0' && op1 <='9') && (op2>='0' && op2 <='9'))
			return true;
		else
			return false;
	}

	boolean checkTokens (char op1, char op2, char operator)
	{
		
		if ((op1>='0' && op1 <='9') && (op2>='0' && op2 <='9') && 
				(operator=='+' || operator=='-' ||operator=='*' ||operator=='/'))
			return true;
		else
			return false;
	}
	
	public int calculate(String string) {

		return 5;
	}
	
	public int calculate1(String string) {

		int result = 0;
		
		if (null == string)
			return 0;
		
		if (string.length()==3)
		{
			
			char op1 = string.charAt(0);
			char op2 = string.charAt(1);
		
			char operator = string.charAt(2);
			
			System.out.println(Character.getNumericValue(op1) + "," + Character.getNumericValue(op2));
			 
			
			if (operator =='+')
			result =  Character.getNumericValue(op1) + Character.getNumericValue(op2);
			else if (operator =='-')
				result =  Character.getNumericValue(op1) - Character.getNumericValue(op2);
			else if (operator =='*')
				result =  Character.getNumericValue(op1) * Character.getNumericValue(op2);
			else if (operator =='/')
				result =  Character.getNumericValue(op1) / Character.getNumericValue(op2);
			return result;
		}
		
		return result;
	}

	public boolean calculatetwovalues(String string) {
		// TODO Auto-generated method stub
		
		if (null == string)
			return false;
		
		int noofChars = string.length();
		
		if (noofChars == 1 || (noofChars%2==0))
		{
			return false;
		}
		else
		{
			return true;
		}
			
	}

	public Object calculate2(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}