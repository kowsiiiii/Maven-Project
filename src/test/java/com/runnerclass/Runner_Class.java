package com.runnerclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.Base_Class;
import com.pom.LogIn_Page;
import com.sdp.Page_Object_Manager;

public class Runner_Class extends Base_Class {

	public static WebDriver driver = Base_Class.getBrowser("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws IOException {

		getUrl("https://adactinhotelapp.com/");
		
		String username=particular_Data("C:\\Users\\kowsalya\\eclipse-workspace\\Maven_8pm\\excel\\User_Name.xlsx", 1, 0);
		
		String password = particular_Data("C:\\Users\\kowsalya\\eclipse-workspace\\Maven_8pm\\excel\\User_Name.xlsx", 1, 1);

		inputValueElement(pom.getInstanceLp().getUserName(), username);

		inputValueElement(pom.getInstanceLp().getPassword(), password);

		clickOnElement(pom.getInstanceLp().getLogin());

	}

}
