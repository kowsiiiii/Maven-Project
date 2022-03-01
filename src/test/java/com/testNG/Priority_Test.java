package com.testNG;

import org.testng.annotations.Test;

public class Priority_Test {

	@Test(priority = 0)
	private void browserLaunch() {
		System.out.println("Browser launch");
	}

	@Test(priority = 1)
	private void getUrl() {
		System.out.println("get url");
	}

	@Test(priority = 2)
	private void signIn() {
		System.out.println("Sign in");
	}

	@Test(priority = -1)
	private void setProperty() {
		System.out.println("Set property");
	}

}
