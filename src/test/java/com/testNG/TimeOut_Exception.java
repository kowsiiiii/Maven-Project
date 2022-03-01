package com.testNG;

import org.testng.annotations.Test;

public class TimeOut_Exception {

	@Test(timeOut = 7000)
	private void login() throws InterruptedException {

		Thread.sleep(2000);

		System.out.println("Set property");

		System.out.println("Browser launch");

		Thread.sleep(2000);

		System.out.println("Get url");

		System.out.println("Maximize");

		System.out.println("click login");

		Thread.sleep(2500);

		System.out.println("Navigate to Home page");

	}

}
