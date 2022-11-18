package com.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class login_flow {
	 
  static  ChromeDriver c;
	
	static String   str1= "https://www.opensource-demo.orangehrmlive.com/";
	
	
	public static void main(String[] args)throws Exception{
		 
	 	System.setProperty("webdriver.chrome.driver", "E:\\Basic java training\\chromedriver86\\chromedriver.exe");
 
		
	 	 c= new ChromeDriver();
	 	 
		// c.manage().window().maximize();
		 

		
		
			 
			 
		 utilities u =new utilities();
	   u.launch_url(str1);
 
	
		
		
		
		
	 u.login("Admin", "admin123");
	 
	  
			 u.logout();
			
	 u.closebrowser();
	  
	  
	   
	}

}
