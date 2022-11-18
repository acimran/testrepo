package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class Openbrowser {

	
	  static ChromeDriver chrome;
	static String str="https://opensource-demo.orangehrmlive.com/";
	
	static String uname="Admin";
	static String Password="admin123";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Basic java training\\chromedriver86\\chromedriver.exe");
		
		 chrome= new ChromeDriver();
		 
		 chrome.manage().window().maximize();
		 
		 chrome.get(str);
		 
		 chrome.findElement(By.name("txtUsername")).sendKeys(uname);
		 chrome.findElement(By.name("txtPassword")).sendKeys(Password);
		 chrome.findElement(By.name("Submit")).click();
		 
		// chrome.findElement(By.name("q")).sendKeys("Fan");
		 
		 //chrome.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 	//c.findElement(By.name("btnk")).sendKeys(Password);
		//  chrome.findElement(By.className("gNO89b")).click();
	 
	}

}
