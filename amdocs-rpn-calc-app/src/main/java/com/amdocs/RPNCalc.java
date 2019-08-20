package com.amdocs;

import java.util.Stack;

public class RPNCalc{
	
	private Stack<Double> numberStack;
	private double firstNumber , secondNumber, result;
	
	public RPNCalc() {
		numberStack = new Stack<Double>();
		firstNumber=secondNumber=result=0.0;
	}
	
	public double evaluate(String rpnMathExpression) {
		
		String[] rpnTokens = rpnMathExpression.split(" ");
		
		IMathOperation mathOperation = null;
		
		for (String token : rpnTokens) {
			
			if (isMathOperator(token)) {
				extractOperands();
				mathOperation = MathFactory.getObject(token);
				result = mathOperation.evaluate(firstNumber,secondNumber);
				numberStack.push(result);
				}
			else
				numberStack.push(Double.parseDouble(token));
		}
		
		return numberStack.pop();
		
	}

	private boolean isMathOperator(String token) {
		// TODO Auto-generated method stub
		String  mathOperators = "+-*/";
		return mathOperators.contains(token);
		//return false;
	}


	private void extractOperands() {
		secondNumber = numberStack.pop();
		firstNumber = numberStack.pop();
	}

}
