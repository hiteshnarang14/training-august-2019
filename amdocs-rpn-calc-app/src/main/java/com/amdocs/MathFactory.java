package com.amdocs;

import java.util.HashMap;

public class MathFactory {
	
	private static HashMap<String, String> classNameMap;
	
	static {
		classNameMap = new HashMap<String, String>();
		classNameMap.put("+", "com.amdocs.Addition");
		classNameMap.put("-", "com.amdocs.Substraction");
		classNameMap.put("*", "com.amdocs.Multiplication");
		classNameMap.put("/", "com.amdocs.Division");
	}

	public static IMathOperation getObject(String mathOperator) {
		// TODO Auto-generated method stub
		IMathOperation mathOperation = null;
		
		String className;
		
		className = classNameMap.get(mathOperator);
		
		try {
			mathOperation = (IMathOperation) Class.forName(className).newInstance();
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		if (mathOperator.equals("+"))
			mathOperation = new Addition();
		
		else if (mathOperator.equals("-"))
			mathOperation = new Substraction();
		
		else if (mathOperator.equals("*"))
			mathOperation = new Multiplication();
		
		else if (mathOperator.equals("/"))
			mathOperation = new Division();
		
		return mathOperation;
	}

}
