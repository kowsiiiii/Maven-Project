package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Test {
	
	@Test(retryAnalyzer = Retry_Class.class)
	private void Demo() {

		String expected = "John";
		
		String actual="Johnson";
		
		//validation
		
		Assert.assertEquals(actual, expected);
		
		System.out.println("Validation");
	}
//	
//	@Test
//	private void Demo() {
//		
//		String expected="John";
//		
//		String actual = "Johnson";
//		
//		SoftAssert soft=new SoftAssert();
//		
//		soft.assertEquals(actual, expected);
//		
//		System.out.println("verification");
//		
//		soft.assertAll();
//
//	}

}
