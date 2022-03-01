package com.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

	@Test(dataProvider = "data")
	private void credentials(String username, String password) {

		System.out.println("Username : " + username);

		System.out.println("Password : " + password);

	}

	@DataProvider
	private Object[][] data() {

		return new Object[][] {

				{ "James", "James@123" },

				{ "Jason", "James@123" },

				{ "Steve", "Steve@123" }

		};

	}

}
