package org.tektutor;

import java.util.HashMap;

public class MathFactory {
 	private static HashMap<String, String> mathClassNameMap = null;

	static {
		mathClassNameMap = new HashMap<String,String>();

		mathClassNameMap.put ( "+", "org.tektutor.Addition" );	
		mathClassNameMap.put ( "-", "org.tektutor.Subtraction" );	
		mathClassNameMap.put ( "*", "org.tektutor.Multiplication" );	
		mathClassNameMap.put ( "/", "org.tektutor.Division" );	
	}

	public static MathOperation getMathObject ( String mathOperator ) {

	 	MathOperation mathOperation = null;
		String className;

		try {
			className = mathClassNameMap.get ( mathOperator );	
			mathOperation = ( MathOperation )Class.forName ( className ).newInstance();
		}
		catch ( Exception e ) {
			e.printStackTrace();
		}

		return mathOperation;

	}

}
