package org.ssglobal.training.codes;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Divide {
	private static Logger logger = Logger.getLogger(Divide.class.getName());
	
	public Divide() {
		logger.setLevel(Level.INFO);
	}
	
	public int div(int x, int y) throws ArithmeticException, Exception{
		logger.info("execute div x =" + " and y" + y);
		logger.info("validation: denominator should not be 0" );//paste lang yung expression na nasa if
		if (y == 0) {
			logger.severe("division by zero not allowed");
			throw new ArithmeticException("division by zero not allowed");
		} else {
			logger.info("execute without errors");
			return x/y;
		}
	}
}
