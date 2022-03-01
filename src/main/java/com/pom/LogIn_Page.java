package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_Page {

	public static WebDriver driver;

	@FindBy(id = "username")

	private WebElement userName;

	@FindBy(id = "password")

	private WebElement password;

	@FindBy(id = "login")

	private WebElement login;

	public LogIn_Page(WebDriver abc) {

		this.driver = abc;

		PageFactory.initElements(driver, this);

	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
