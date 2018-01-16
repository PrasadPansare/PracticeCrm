package com.crm.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.automation.common.BasePage;

public class LoginPage extends BasePage {
	
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(css = "input[value='Login']")
	WebElement loginBtn;
	
	@FindBy(name = "password")
	WebElement loggedInUser;
	
	public LoginPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void login(String username, String password){
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		loginBtn.click();
	}
	
	public boolean isUserLoggedIn(){
		return actions.isDisplayed(loggedInUser);
	}

}
