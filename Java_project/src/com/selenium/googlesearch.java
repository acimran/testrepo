package com.selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearch {
	
	
	static ChromeDriver chrome;
	

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "E:\\Basic java training\\chromedriver86\\chromedriver.exe");
	 
		try {
			chrome = new ChromeDriver();
			chrome.manage().window().maximize();
			chrome.get("https://www.google.com");
			
			chrome.findElementByName("q").sendKeys("fan");
			Thread.sleep(3000);
			chrome.findElementByName("q").sendKeys(Keys.ENTER);
			//chrome.findElementByName("btnk").click();
			
			Thread.sleep(3000);
			boolean f=chrome.findElementByLinkText("Sign in").isDisplayed();
			if(f) {
				System.out.println("Test is passed");
				}
			else
			{
				System.out.println("Test is failed");
				}
			
		 
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
