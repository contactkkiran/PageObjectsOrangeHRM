package com.orangehrmtest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.orangehrm.pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test	
	public void verifyLogin() {
		//Get DriverInstance
		WebDriver driver = getDriver();
		//Launch Orange HRM login Page
		LoginPage loginPage =new LoginPage(driver);
		loginPage.login();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}
	
	
	
	
	
	
	


}
