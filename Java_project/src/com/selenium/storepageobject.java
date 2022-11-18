package com.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class storepageobject {
	@FindBy(name="user_login")
	WebElement un;
	
	@FindBy(name="user_password")
	WebElement pwd;
	
	@FindBy(name="submit")
	WebElement login_button;
	
	public void login() {
		
		un.sendKeys("username");
		pwd.sendKeys("password");
		login_button.click();
	}
	
	 
	

}
