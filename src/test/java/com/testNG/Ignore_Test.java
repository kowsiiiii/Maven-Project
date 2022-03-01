package com.testNG;

import org.testng.annotations.Test;

import org.testng.annotations.Ignore;

public class Ignore_Test {

	@Ignore
	@Test
	private void women() {
		System.out.println("Women");
	}

	@Test
	private void men() {
		System.out.println("men");
	}

	@Test(enabled = false)
	private void child() {
		System.out.println("child");
	}

	@Test
	private void tshirt() {
		System.out.println("tshirt");
	}

}
