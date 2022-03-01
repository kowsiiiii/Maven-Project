package com.testNG;

import org.testng.annotations.Test;

public class Expected_Exceptions {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void Demo() {

		int a=10;
		
		System.out.println(a/0);
	}

}
