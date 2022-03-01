package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.LogIn_Page;

public class Page_Object_Manager {

	public static WebDriver driver;

	private LogIn_Page lp;

	public Page_Object_Manager(WebDriver driver2) {

		this.driver = driver2;

	}

	public LogIn_Page getInstanceLp() {

		lp = new LogIn_Page(driver);

		return lp;

	}

}
