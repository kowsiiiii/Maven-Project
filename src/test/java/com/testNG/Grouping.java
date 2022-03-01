package com.testNG;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = "music")
	private void spotify() {
		System.out.println("Spotify");
	}

	@Test(groups = "music")
	private void wynk() {
		System.out.println("Wynk");
	}

	@Test(groups = "activities")
	private void sports() {
		System.out.println("Sports");
	}

	@Test(groups = "shopping")
	private void dressess() {
		System.out.println("Dressess");

	}

	@Test(groups = "shopping")
	private void Tshirt() {
		System.out.println("T-shirt");
	}
}
