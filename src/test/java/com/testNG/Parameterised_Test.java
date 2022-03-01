package com.testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterised_Test {

	@Test
	@Parameters({ "username", "password" })
	private void credentials(@Optional("Jason")String username, String password) {

		// inputValueElement(pom.getInstanceHp().getUsername().username);

		System.out.println("Username : " + username);

		System.out.println("Password : " + password);

	}

}
