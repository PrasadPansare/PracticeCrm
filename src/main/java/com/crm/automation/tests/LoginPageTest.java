package com.crm.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.automation.common.BaseTest;
import com.crm.automation.pages.LoginPage;

public class LoginPageTest extends BaseTest{
	
	LoginPage loginPage;
	@Test
	public void logintest(){
		loginPage = new LoginPage(driver);
		loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
		Assert.assertTrue(loginPage.isUserLoggedIn());
	}
}
