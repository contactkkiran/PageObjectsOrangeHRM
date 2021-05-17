package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrmtest.BaseTest;

public class LoginPage{
	WebDriver driver;
	/**

     * All WebElements are identified by @FindBy annotation

     */
	@FindBy(name="txtUsername")
    WebElement userName;
	
	@FindBy(name="txtPassword")
    WebElement password;
	
	@FindBy(id="btnLogin")
    WebElement signInButton;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public void login() {
		// TODO Auto-generated method stub
     userName.sendKeys("Admin");
     password.sendKeys("admin123");
     signInButton.click();
	}
	
}
