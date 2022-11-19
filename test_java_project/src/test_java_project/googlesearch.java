package test_java_project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class googlesearch{

	public static void main(String[] args) throws Exception 
	{
		  System.setProperty("webdriver.chrome.driver", "E:\\Basic java training\\chromedriver105\\chromedriver.exe");
		  
		  ChromeDriver c=new ChromeDriver();
		
		 c.get("https://www.google.com");	 
			c.findElement(By.name("q")).sendKeys("fan");
			
			
			c.findElement(By.name("q")).sendKeys(Keys.ENTER);
			
			//c.close();
		//	c.findElement(By.name("btnk")).click();
		 
	}
}