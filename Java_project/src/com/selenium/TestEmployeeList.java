package com.selenium;

  

import org.openqa.selenium.By;
 
 
public class TestEmployeeList {


	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Basic java training\\107\\chromedriver.exe");       
		
		utilities u= new utilities();
		
		u.launch("https://opensource-demo.orangehrmlive.com/");
		
		u.login("Admin", "admin123");
		
		Thread.sleep(3000);
		
		u.search();
		 
 			u.logout();
 		
 			u.closebrowser();
		
		

	}

}
