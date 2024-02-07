package com.example;

import org.apache.log4j.Logger;
import org.apache.commons.lang3.StringUtils;

public class ChildClass {
	
	/** Class logger */
	private static Logger logger = Logger.getLogger(ChildClass.class);
	
	public static void main(String[] args) {
		if (StringUtils.isNotBlank("whatever")) {
			System.out.println("not");
		} else {
			System.out.println("yes");
		}
	}
	
}