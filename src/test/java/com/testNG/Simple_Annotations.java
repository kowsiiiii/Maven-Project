package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	private void setProperty() {
		System.out.println("Set property");
	}

	@BeforeTest

	private void browserLaunch() {
		System.out.println("Launch the Browser");
	}

	@BeforeClass
	private void launchUrl() {
		System.out.println("Launching the url");

	}

	@BeforeMethod
	private void signIn() {
		System.out.println("Sign in");
	}

	@Test
	private void women() {

		System.out.println("Women");

	}

	@Test
	private void dresses() {

		System.out.println("Dresses");
	}

	@Test
	private void tshirt() {

		System.out.println("T-shirt");
	}

	@AfterMethod
	private void signoff() {

		System.out.println("sign-off");
	}

	@AfterClass
	private void homePage() {

		System.out.println("Home page");
	}

	@AfterTest

	private void close() {

		System.out.println("Close");

	}

	@AfterSuite
	private void deleteCookies() {

		System.out.println("Delete the cookies");

	}
}
