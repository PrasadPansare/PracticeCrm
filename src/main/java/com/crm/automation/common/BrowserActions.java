package com.crm.automation.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserActions {
	WebDriver driver;

	public BrowserActions(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean isDisplayed(WebElement element){
		return element.isDisplayed();
	}
}
