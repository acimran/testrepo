package com.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class zero_login {
	
	static ChromeDriver chrome;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Basic java training\\107\\chromedriver.exe");       
			
	 chrome= new ChromeDriver();
	 
	 chrome.manage().window().maximize();
	 
	 chrome.get("http://zero.webappsecurity.com/login.html");
	 
	 System.out.println("Code here  ");
	 
	 
	 storepageobject obj =PageFactory.initElements(chrome,storepageobject.class);
	 
	 Thread.sleep(3000);
	 
	 obj.login();
	 
	}

}
